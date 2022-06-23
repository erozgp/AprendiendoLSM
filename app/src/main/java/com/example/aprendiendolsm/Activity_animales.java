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

public class Activity_animales extends AppCompatActivity {
    GridLayout MenuGridANIMALES;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animales);
        MenuGridANIMALES = (GridLayout)findViewById(R.id.MenuLayoutAnimales);

        //Evento
        setSingleEvent(MenuGridANIMALES);
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
        for (int i = 0; i<MenuGridANIMALES.getChildCount();i++){
            //Cast el objeto devuelto a CardView
            CardView cardView = (CardView)MenuGridANIMALES.getChildAt(i);
            final int conteo = i;
            cardView.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (conteo == 0){
                        Intent intent = new Intent(Activity_animales.this, MuestraAnimales.class);

                        intent.putExtra("animales", "Araña");
                        startActivity(intent);
                    } else if (conteo == 1){
                        Intent intent = new Intent(Activity_animales.this, MuestraAnimales.class);

                        intent.putExtra("animales", "Ardilla");
                        startActivity(intent);
                    }else if (conteo == 2){
                        Intent intent = new Intent(Activity_animales.this, MuestraAnimales.class);

                        intent.putExtra("animales", "Asno");
                        startActivity(intent);
                    }else if (conteo == 3){
                        Intent intent = new Intent(Activity_animales.this, MuestraAnimales.class);

                        intent.putExtra("animales", "Borrego");
                        startActivity(intent);
                    }else if (conteo == 4){
                        Intent intent = new Intent(Activity_animales.this, MuestraAnimales.class);

                        intent.putExtra("animales", "Búho");
                        startActivity(intent);
                    }else if (conteo == 5){
                        Intent intent = new Intent(Activity_animales.this, MuestraAnimales.class);

                        intent.putExtra("animales", "Caballo");
                        startActivity(intent);
                    }else if (conteo == 6){
                        Intent intent = new Intent(Activity_animales.this, MuestraAnimales.class);

                        intent.putExtra("animales", "Camarón");
                        startActivity(intent);
                    }else if (conteo == 7){
                        Intent intent = new Intent(Activity_animales.this, MuestraAnimales.class);

                        intent.putExtra("animales", "Caracol");
                        startActivity(intent);
                    }else if (conteo == 8){
                        Intent intent = new Intent(Activity_animales.this, MuestraAnimales.class);

                        intent.putExtra("animales", "Chango");
                        startActivity(intent);
                    }else if (conteo == 9){
                        Intent intent = new Intent(Activity_animales.this, MuestraAnimales.class);

                        intent.putExtra("animales", "Cochino");
                        startActivity(intent);
                    }else if (conteo == 10){
                        Intent intent = new Intent(Activity_animales.this, MuestraAnimales.class);

                        intent.putExtra("animales", "Cocodrilo");
                        startActivity(intent);
                    }else if (conteo == 11){
                        Intent intent = new Intent(Activity_animales.this, MuestraAnimales.class);

                        intent.putExtra("animales", "Conejo");
                        startActivity(intent);
                    }else if (conteo == 12){
                        Intent intent = new Intent(Activity_animales.this, MuestraAnimales.class);

                        intent.putExtra("animales", "Delfín");
                        startActivity(intent);
                    }else if (conteo == 13){
                        Intent intent = new Intent(Activity_animales.this, MuestraAnimales.class);

                        intent.putExtra("animales", "Elefante");
                        startActivity(intent);
                    }else if (conteo == 14){
                        Intent intent = new Intent(Activity_animales.this, MuestraAnimales.class);

                        intent.putExtra("animales", "Gallo");
                        startActivity(intent);
                    }else if (conteo == 15){
                        Intent intent = new Intent(Activity_animales.this, MuestraAnimales.class);

                        intent.putExtra("animales", "Gato");
                        startActivity(intent);
                    }else if (conteo == 16){
                        Intent intent = new Intent(Activity_animales.this, MuestraAnimales.class);

                        intent.putExtra("animales", "Gorila");
                        startActivity(intent);
                    }else if (conteo == 17){
                        Intent intent = new Intent(Activity_animales.this, MuestraAnimales.class);

                            intent.putExtra("animales", "Guajolote");
                        startActivity(intent);
                    }else if (conteo == 18){
                        Intent intent = new Intent(Activity_animales.this, MuestraAnimales.class);

                        intent.putExtra("animales", "Gusano");
                        startActivity(intent);
                    }else if (conteo == 19){
                        Intent intent = new Intent(Activity_animales.this, MuestraAnimales.class);

                        intent.putExtra("animales", "Hormiga");
                        startActivity(intent);
                    }else if (conteo == 20){
                        Intent intent = new Intent(Activity_animales.this, MuestraAnimales.class);

                        intent.putExtra("animales", "León");
                        startActivity(intent);
                    }else if (conteo == 21){
                        Intent intent = new Intent(Activity_animales.this, MuestraAnimales.class);

                        intent.putExtra("animales", "Lobo");
                        startActivity(intent);
                    }else if (conteo == 22){
                        Intent intent = new Intent(Activity_animales.this, MuestraAnimales.class);

                        intent.putExtra("animales", "Mariposa");
                        startActivity(intent);
                    }else if (conteo == 23){
                        Intent intent = new Intent(Activity_animales.this, MuestraAnimales.class);

                        intent.putExtra("animales", "Mono");
                        startActivity(intent);
                    }else if (conteo == 24){
                        Intent intent = new Intent(Activity_animales.this, MuestraAnimales.class);

                        intent.putExtra("animales", "Mosca");
                        startActivity(intent);
                    }else if (conteo == 25){
                        Intent intent = new Intent(Activity_animales.this, MuestraAnimales.class);

                        intent.putExtra("animales", "Mosquito");
                        startActivity(intent);
                    }else if (conteo == 26){
                        Intent intent = new Intent(Activity_animales.this, MuestraAnimales.class);

                        intent.putExtra("animales", "Mula");
                        startActivity(intent);
                    }else if (conteo == 27){
                        Intent intent = new Intent(Activity_animales.this, MuestraAnimales.class);

                        intent.putExtra("animales", "Oso");
                        startActivity(intent);
                    }else if (conteo == 28){
                        Intent intent = new Intent(Activity_animales.this, MuestraAnimales.class);

                        intent.putExtra("animales", "Pájaro");
                        startActivity(intent);
                    }else if (conteo == 29){
                        Intent intent = new Intent(Activity_animales.this, MuestraAnimales.class);

                        intent.putExtra("animales", "Paloma");
                        startActivity(intent);
                    }else if (conteo == 30){
                        Intent intent = new Intent(Activity_animales.this, MuestraAnimales.class);

                        intent.putExtra("animales", "Pato");
                        startActivity(intent);
                    }else if (conteo == 31){
                        Intent intent = new Intent(Activity_animales.this, MuestraAnimales.class);

                        intent.putExtra("animales", "Perico");
                        startActivity(intent);
                    }else if (conteo == 32){
                        Intent intent = new Intent(Activity_animales.this, MuestraAnimales.class);

                        intent.putExtra("animales", "Perro");
                        startActivity(intent);
                    }else if (conteo == 33){
                        Intent intent = new Intent(Activity_animales.this, MuestraAnimales.class);

                        intent.putExtra("animales", "Pez");
                        startActivity(intent);
                    }else if (conteo == 34){
                        Intent intent = new Intent(Activity_animales.this, MuestraAnimales.class);

                        intent.putExtra("animales", "Pollo");
                        startActivity(intent);
                    }else if (conteo == 35){
                        Intent intent = new Intent(Activity_animales.this, MuestraAnimales.class);

                        intent.putExtra("animales", "Ratón");
                        startActivity(intent);
                    }else if (conteo == 36){
                        Intent intent = new Intent(Activity_animales.this, MuestraAnimales.class);

                        intent.putExtra("animales", "Sapo");
                        startActivity(intent);
                    }else if (conteo == 37){
                        Intent intent = new Intent(Activity_animales.this, MuestraAnimales.class);

                        intent.putExtra("animales", "Tigre");
                        startActivity(intent);
                    }else if (conteo == 38){
                        Intent intent = new Intent(Activity_animales.this, MuestraAnimales.class);

                        intent.putExtra("animales", "Toro");
                        startActivity(intent);
                    }else if (conteo == 39){
                        Intent intent = new Intent(Activity_animales.this, MuestraAnimales.class);

                        intent.putExtra("animales", "Tortuga");
                        startActivity(intent);
                    }else if (conteo == 40){
                        Intent intent = new Intent(Activity_animales.this, MuestraAnimales.class);

                        intent.putExtra("animales", "Vaca");
                        startActivity(intent);
                    }else if (conteo == 41){
                        Intent intent = new Intent(Activity_animales.this, MuestraAnimales.class);

                        intent.putExtra("animales", "Venado");
                        startActivity(intent);
                    }else if (conteo == 42){
                        Intent intent = new Intent(Activity_animales.this, MuestraAnimales.class);

                        intent.putExtra("animales", "Víbora");
                        startActivity(intent);
                    }else if (conteo == 43){
                        Intent intent = new Intent(Activity_animales.this, MuestraAnimales.class);

                        intent.putExtra("animales", "Zorro");
                        startActivity(intent);
                    }
                }
            });
        }
    }
}
