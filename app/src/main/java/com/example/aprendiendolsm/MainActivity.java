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

public class MainActivity extends AppCompatActivity {

    GridLayout MenuGrid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MenuGrid = (GridLayout)findViewById(R.id.MenuLayout);

        //Evento
        setSingleEvent(MenuGrid);
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
        for (int i = 0; i<MenuGrid.getChildCount();i++){
            //Cast el objeto devuelto a CardView
            CardView cardView = (CardView)MenuGrid.getChildAt(i);
            final int conteo = i;
            cardView.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (conteo == 0){
                        Intent intent = new Intent(MainActivity.this, Activity_abecedario.class);
                        startActivity(intent);
                    } else if (conteo == 1){
                        Intent intent = new Intent(MainActivity.this, Activity_numeros.class);
                        startActivity(intent);
                    }else if (conteo == 2){
                        Intent intent = new Intent(MainActivity.this, Activity_colores.class);
                        startActivity(intent);
                    }else if (conteo == 3){
                        Intent intent = new Intent(MainActivity.this, Activity_animales.class);
                        startActivity(intent);
                    }else if (conteo == 4){
                        Intent intent = new Intent(MainActivity.this, Activity_calendario.class);
                        startActivity(intent);
                    }else if (conteo == 5){
                        Intent intent = new Intent(MainActivity.this, Activity_lugares_comunes.class);
                        startActivity(intent);
                    }else if (conteo == 6){
                        Intent intent = new Intent(MainActivity.this, Activity_frutas_verduras.class);
                        startActivity(intent);
                    }else if (conteo == 7){
                        Intent intent = new Intent(MainActivity.this, Activity_republica_mexicana.class);
                        startActivity(intent);
                    }
                }
            });
        }
    }
}
