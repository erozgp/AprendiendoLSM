package com.example.aprendiendolsm.controladorNumeros;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.aprendiendolsm.Informacion;
import com.example.aprendiendolsm.MuestraAbecedario;
import com.example.aprendiendolsm.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.FileDownloadTask;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.io.File;
import java.io.IOException;

public class MuestraNumeros extends AppCompatActivity {
    ImageView imagen;
    FirebaseStorage storage = FirebaseStorage.getInstance();
    StorageReference storageReference;
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    TextView descTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muestra_numeros);

        Bundle bundle = getIntent().getExtras();
        TextView myTextView=(TextView) findViewById(R.id.textNumeroTitulo);
        descTextView = (TextView) findViewById(R.id.textNumerooDesc);
        if (bundle.getString("ordinal") == null){
            myTextView.setText("Número " + bundle.getInt("numero") );
            int var = bundle.getInt("numero");
            storageReference = storage.getReferenceFromUrl("gs://aprendiendo-lsm.appspot.com").child(var + ".png");
            db.collection("NUMEROS")
                    .document(Integer.toString(var))
                    .get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
                @Override
                public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                    if (task.isSuccessful()){
                        DocumentSnapshot document = task.getResult();
                        if (document.exists()){
                            String Desc =  document.getData().get("desc").toString();
                            descTextView.setText("Descripción: \n" + Desc);
                        }
                    }
                }
            });
        }else{
            myTextView.setText("Número " + bundle.getString("ordinal") );
            storageReference = storage.getReferenceFromUrl("gs://aprendiendo-lsm.appspot.com").child(bundle.getString("ordinal") + ".png");
            db.collection("NUMEROS")
                    .document(bundle.getString("ordinal"))
                    .get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
                @Override
                public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                    if (task.isSuccessful()){
                        DocumentSnapshot document = task.getResult();
                        if (document.exists()){
                            String Desc =  document.getData().get("desc").toString();
                            descTextView.setText("Descripción: \n" + Desc);
                        }
                    }
                }
            });
        }



        imagen = (ImageView) findViewById(R.id.imagenNumero);
        try {
            final File file = File.createTempFile("imagen", "png");
            storageReference.getFile(file).addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                @Override
                public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                    Bitmap bitmap = BitmapFactory.decodeFile(file.getAbsolutePath());
                    imagen.setImageBitmap(bitmap);
                }
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Toast.makeText(MuestraNumeros.this, "Fallo al cargar la imagen", Toast.LENGTH_SHORT).show();
                }
            });
        } catch (IOException e) {
            Toast.makeText(MuestraNumeros.this, "Fallo al cargar la imagen", Toast.LENGTH_SHORT).show();
            e.printStackTrace();
        }



    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.btbInfo:
                Intent intent = new Intent(getBaseContext(), Informacion.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}