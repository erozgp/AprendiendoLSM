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

public class Activity_republica_mexicana extends AppCompatActivity {
    GridLayout MenuGridMX;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_republica_mexicana);
        MenuGridMX = (GridLayout)findViewById(R.id.MenuLayoutMX);

        //Evento
        setSingleEvent(MenuGridMX);

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
        for (int i = 0; i<MenuGridMX.getChildCount();i++){
            //Cast el objeto devuelto a CardView
            CardView cardView = (CardView)MenuGridMX.getChildAt(i);
            final int conteo = i;
            cardView.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (conteo == 0){
                        Intent intent = new Intent(Activity_republica_mexicana.this, MuestraMX.class);

                        intent.putExtra("mx", "Aguascalientes");
                        startActivity(intent);
                    }else if (conteo == 1){
                        Intent intent = new Intent(Activity_republica_mexicana.this, MuestraMX.class);

                        intent.putExtra("mx", "Baja California");
                        startActivity(intent);
                    }else if (conteo == 2){
                        Intent intent = new Intent(Activity_republica_mexicana.this, MuestraMX.class);

                        intent.putExtra("mx", "Baja California Sur");
                        startActivity(intent);
                    }else if (conteo == 3){
                        Intent intent = new Intent(Activity_republica_mexicana.this, MuestraMX.class);

                        intent.putExtra("mx", "Campeche");
                        startActivity(intent);
                    }else if (conteo == 4){
                        Intent intent = new Intent(Activity_republica_mexicana.this, MuestraMX.class);

                        intent.putExtra("mx", "Chiapas");
                        startActivity(intent);
                    }else if (conteo == 5){
                        Intent intent = new Intent(Activity_republica_mexicana.this, MuestraMX.class);

                        intent.putExtra("mx", "Chihuahua");
                        startActivity(intent);
                    }else if (conteo == 6){
                        Intent intent = new Intent(Activity_republica_mexicana.this, MuestraMX.class);

                        intent.putExtra("mx", "Coahuila");
                        startActivity(intent);
                    }else if (conteo == 7){
                        Intent intent = new Intent(Activity_republica_mexicana.this, MuestraMX.class);

                        intent.putExtra("mx", "Colima");
                        startActivity(intent);
                    }else if (conteo == 8){
                        Intent intent = new Intent(Activity_republica_mexicana.this, MuestraMX.class);

                        intent.putExtra("mx", "DF");
                        startActivity(intent);
                    }else if (conteo == 9){
                        Intent intent = new Intent(Activity_republica_mexicana.this, MuestraMX.class);
                        intent.putExtra("mx", "Durango");

                        startActivity(intent);
                    }else if (conteo == 10){
                        Intent intent = new Intent(Activity_republica_mexicana.this, MuestraMX.class);

                        intent.putExtra("mx", "Guanajuato");
                        startActivity(intent);
                    }else if (conteo == 11){
                        Intent intent = new Intent(Activity_republica_mexicana.this, MuestraMX.class);

                        intent.putExtra("mx", "Guerrero");
                        startActivity(intent);
                    }else if (conteo == 12){
                        Intent intent = new Intent(Activity_republica_mexicana.this, MuestraMX.class);

                        intent.putExtra("mx", "Hidalgo");
                        startActivity(intent);
                    }else if (conteo == 13){
                        Intent intent = new Intent(Activity_republica_mexicana.this, MuestraMX.class);

                        intent.putExtra("mx", "Jalisco");
                        startActivity(intent);
                    }else if (conteo == 14){
                        Intent intent = new Intent(Activity_republica_mexicana.this, MuestraMX.class);

                        intent.putExtra("mx", "Michoacán");
                        startActivity(intent);
                    }else if (conteo == 15){
                        Intent intent = new Intent(Activity_republica_mexicana.this, MuestraMX.class);

                        intent.putExtra("mx", "Morelos");
                        startActivity(intent);
                    }else if (conteo == 16){
                        Intent intent = new Intent(Activity_republica_mexicana.this, MuestraMX.class);

                        intent.putExtra("mx", "Nayarit");
                        startActivity(intent);
                    }else if (conteo == 17){
                        Intent intent = new Intent(Activity_republica_mexicana.this, MuestraMX.class);

                        intent.putExtra("mx", "Nuevo León");
                        startActivity(intent);
                    }else if (conteo == 18){
                        Intent intent = new Intent(Activity_republica_mexicana.this, MuestraMX.class);

                        intent.putExtra("mx", "Oaxaca");
                        startActivity(intent);
                    }else if (conteo == 19){
                        Intent intent = new Intent(Activity_republica_mexicana.this, MuestraMX.class);

                        intent.putExtra("mx", "Puebla");
                        startActivity(intent);
                    }else if (conteo == 20){
                        Intent intent = new Intent(Activity_republica_mexicana.this, MuestraMX.class);

                        intent.putExtra("mx", "Querétaro");
                        startActivity(intent);
                    }else if (conteo == 21){
                        Intent intent = new Intent(Activity_republica_mexicana.this, MuestraMX.class);

                        intent.putExtra("mx", "Quintana Roo");
                        startActivity(intent);
                    }else if (conteo == 22){
                        Intent intent = new Intent(Activity_republica_mexicana.this, MuestraMX.class);

                        intent.putExtra("mx", "San Luis Potosí");
                        startActivity(intent);
                    }else if (conteo == 23){
                        Intent intent = new Intent(Activity_republica_mexicana.this, MuestraMX.class);

                        intent.putExtra("mx", "Sinaloa");
                        startActivity(intent);
                    }else if (conteo == 24){
                        Intent intent = new Intent(Activity_republica_mexicana.this, MuestraMX.class);

                        intent.putExtra("mx", "Sonora");
                        startActivity(intent);
                    }else if (conteo == 25){
                        Intent intent = new Intent(Activity_republica_mexicana.this, MuestraMX.class);

                        intent.putExtra("mx", "Tabasco");
                        startActivity(intent);
                    }else if (conteo == 26){
                        Intent intent = new Intent(Activity_republica_mexicana.this, MuestraMX.class);

                        intent.putExtra("mx", "Tamaulipas");
                        startActivity(intent);
                    }else if (conteo == 27){
                        Intent intent = new Intent(Activity_republica_mexicana.this, MuestraMX.class);

                        intent.putExtra("mx", "Tlaxcala");
                        startActivity(intent);
                    }else if (conteo == 28){
                        Intent intent = new Intent(Activity_republica_mexicana.this, MuestraMX.class);

                        intent.putExtra("mx", "Veracruz");
                        startActivity(intent);
                    }else if (conteo == 29){
                        Intent intent = new Intent(Activity_republica_mexicana.this, MuestraMX.class);

                        intent.putExtra("mx", "Yucatán");
                        startActivity(intent);
                    }else if (conteo == 30){
                        Intent intent = new Intent(Activity_republica_mexicana.this, MuestraMX.class);

                        intent.putExtra("mx", "Zacatecas");
                        startActivity(intent);
                    }
                }
            });
        }
    }
}
