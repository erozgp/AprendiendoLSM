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

public class Activity_lugares_comunes extends AppCompatActivity {
    GridLayout MenuGridLugaresComunes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lugares_comunes);

        MenuGridLugaresComunes = (GridLayout)findViewById(R.id.MenuLayoutLugaresCmunes);

        //Evento
        setSingleEvent(MenuGridLugaresComunes);
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
        for (int i = 0; i<MenuGridLugaresComunes.getChildCount();i++){
            //Cast el objeto devuelto a CardView
            CardView cardView = (CardView)MenuGridLugaresComunes.getChildAt(i);
            final int conteo = i;
            cardView.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (conteo == 0){
                        Intent intent = new Intent(Activity_lugares_comunes.this, MuestraLG.class);

                        intent.putExtra("lg", "Azotea");
                        startActivity(intent);
                    } else if (conteo == 1){
                        Intent intent = new Intent(Activity_lugares_comunes.this, MuestraLG.class);

                        intent.putExtra("lg", "Baño");
                        startActivity(intent);
                    }else if (conteo == 2){
                        Intent intent = new Intent(Activity_lugares_comunes.this, MuestraLG.class);

                        intent.putExtra("lg", "Casa");
                        startActivity(intent);
                    }else if (conteo == 3){
                        Intent intent = new Intent(Activity_lugares_comunes.this, MuestraLG.class);

                        intent.putExtra("lg", "Cocina");
                        startActivity(intent);
                    }else if (conteo == 4){
                        Intent intent = new Intent(Activity_lugares_comunes.this, MuestraLG.class);

                        intent.putExtra("lg", "Corredor");
                        startActivity(intent);
                    }else if (conteo == 5){
                        Intent intent = new Intent(Activity_lugares_comunes.this, MuestraLG.class);

                        intent.putExtra("lg", "Cuarto");
                        startActivity(intent);
                    }else if (conteo == 6){
                        Intent intent = new Intent(Activity_lugares_comunes.this, MuestraLG.class);

                        intent.putExtra("lg", "Parque");
                        startActivity(intent);
                    }else if (conteo == 7){
                        Intent intent = new Intent(Activity_lugares_comunes.this, MuestraLG.class);

                        intent.putExtra("lg", "Patio");
                        startActivity(intent);
                    }else if (conteo == 8){
                        Intent intent = new Intent(Activity_lugares_comunes.this, MuestraLG.class);

                        intent.putExtra("lg", "Sala");
                        startActivity(intent);
                    }else if (conteo == 9){
                        Intent intent = new Intent(Activity_lugares_comunes.this, MuestraLG.class);

                        intent.putExtra("lg", "Vecindad");
                        startActivity(intent);
                    }else if (conteo == 10){
                        Intent intent = new Intent(Activity_lugares_comunes.this, MuestraLG.class);

                        intent.putExtra("lg", "Escuela");
                        startActivity(intent);
                    }else if (conteo == 11){
                        Intent intent = new Intent(Activity_lugares_comunes.this, MuestraLG.class);

                        intent.putExtra("lg", "Preparatoria");
                        startActivity(intent);
                    }else if (conteo == 12){
                        Intent intent = new Intent(Activity_lugares_comunes.this, MuestraLG.class);

                        intent.putExtra("lg", "Primaria");
                        startActivity(intent);
                    }else if (conteo == 13){
                        Intent intent = new Intent(Activity_lugares_comunes.this, MuestraLG.class);

                        intent.putExtra("lg", "Secundaria");
                        startActivity(intent);
                    }
                }
            });
        }
    }
}
