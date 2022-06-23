package com.example.aprendiendolsm;

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

public class MuestraLG extends AppCompatActivity {
    ImageView imagen;
    FirebaseStorage storage = FirebaseStorage.getInstance();
    StorageReference storageReference;
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    TextView descTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muestra_l_g);
        Bundle bundle = getIntent().getExtras();
        TextView myTextView=(TextView) findViewById(R.id.textLGTitulo);
        myTextView.setText( bundle.getString("lg") );

        descTextView = (TextView) findViewById(R.id.textLGDesc);

        storageReference = storage.getReferenceFromUrl("gs://aprendiendo-lsm.appspot.com").child(bundle.getString("lg") + ".png");
        imagen = (ImageView) findViewById(R.id.imagenLG);
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
                    Toast.makeText(MuestraLG.this, "Fallo al cargar la imagen", Toast.LENGTH_SHORT).show();
                }
            });
        } catch (IOException e) {
            Toast.makeText(MuestraLG.this, "Fallo al cargar la imagen", Toast.LENGTH_SHORT).show();
            e.printStackTrace();
        }

        db.collection("LG")
                .document(bundle.getString("lg"))
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