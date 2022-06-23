package com.example.aprendiendolsm;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

public class Activity_colores extends AppCompatActivity {
    GridLayout MenuGridCOLORES;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colores);
        MenuGridCOLORES = (GridLayout)findViewById(R.id.MenuLayoutColores);

        //Evento
        setSingleEvent(MenuGridCOLORES);
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
    private void setSingleEvent(GridLayout menuGrid) {
        //Recorro todos los items de MenuGrid
        for (int i = 0; i<MenuGridCOLORES.getChildCount();i++){
            //Cast el objeto devuelto a CardView
            CardView cardView = (CardView)MenuGridCOLORES.getChildAt(i);
            final int conteo = i;
            cardView.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (conteo == 0){
                        Intent intent = new Intent(Activity_colores.this, MuestraColores.class);

                        intent.putExtra("color", "Amarillo");
                        startActivity(intent);
                    } else if (conteo == 1){
                        Intent intent = new Intent(Activity_colores.this, MuestraColores.class);

                        intent.putExtra("color", "Anaranjado");
                        startActivity(intent);
                    }else if (conteo == 2){
                        Intent intent = new Intent(Activity_colores.this, MuestraColores.class);

                        intent.putExtra("color", "Azul");
                        startActivity(intent);
                    }else if (conteo == 3){
                        Intent intent = new Intent(Activity_colores.this, MuestraColores.class);

                        intent.putExtra("color", "Blanco");
                        startActivity(intent);
                    }else if (conteo == 4){
                        Intent intent = new Intent(Activity_colores.this, MuestraColores.class);

                        intent.putExtra("color", "Café");
                        startActivity(intent);
                    }else if (conteo == 5){
                        Intent intent = new Intent(Activity_colores.this, MuestraColores.class);

                        intent.putExtra("color", "Gris");
                        startActivity(intent);
                    }else if (conteo == 6){
                        Intent intent = new Intent(Activity_colores.this, MuestraColores.class);

                        intent.putExtra("color", "Morado");
                        startActivity(intent);
                    }else if (conteo == 7){
                        Intent intent = new Intent(Activity_colores.this, MuestraColores.class);

                        intent.putExtra("color", "Negro");
                        startActivity(intent);
                    }else if (conteo == 8){
                        Intent intent = new Intent(Activity_colores.this, MuestraColores.class);

                        intent.putExtra("color", "Oro");
                        startActivity(intent);
                    }else if (conteo == 9){
                        Intent intent = new Intent(Activity_colores.this, MuestraColores.class);

                        intent.putExtra("color", "Plata");
                        startActivity(intent);
                    }else if (conteo == 10){
                        Intent intent = new Intent(Activity_colores.this, MuestraColores.class);

                        intent.putExtra("color", "Rojo");
                        startActivity(intent);
                    }else if (conteo == 11){
                        Intent intent = new Intent(Activity_colores.this, MuestraColores.class);

                        intent.putExtra("color", "Rosa");
                        startActivity(intent);
                    }else if (conteo == 12){
                        Intent intent = new Intent(Activity_colores.this, MuestraColores.class);

                        intent.putExtra("color", "Verde");
                        startActivity(intent);
                    }
                }
            });
        }
    }
}
