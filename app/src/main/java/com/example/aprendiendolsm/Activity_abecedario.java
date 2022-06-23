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


public class Activity_abecedario extends AppCompatActivity {
    GridLayout MenuGridABECEDARIO;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abecedario);

        MenuGridABECEDARIO = (GridLayout)findViewById(R.id.MenuLayoutAbecedario);

        //Evento
        setSingleEvent(MenuGridABECEDARIO);

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
        for (int i = 0; i<MenuGridABECEDARIO.getChildCount();i++){
            //Cast el objeto devuelto a CardView
            CardView cardView = (CardView)MenuGridABECEDARIO.getChildAt(i);
            final int conteo = i;
            cardView.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (conteo == 0){
                        Intent intent = new Intent(Activity_abecedario.this, MuestraAbecedario.class);

                        intent.putExtra("letra", "A");
                        startActivity(intent);
                    } else if (conteo == 1){
                        Intent intent = new Intent(Activity_abecedario.this, MuestraAbecedario.class);

                        intent.putExtra("letra", "B");
                        startActivity(intent);
                    }else if (conteo == 2){
                        Intent intent = new Intent(Activity_abecedario.this, MuestraAbecedario.class);

                        intent.putExtra("letra", "C");
                        startActivity(intent);
                    }else if (conteo == 3){
                        Intent intent = new Intent(Activity_abecedario.this, MuestraAbecedario.class);

                        intent.putExtra("letra", "D");
                        startActivity(intent);
                    }else if (conteo == 4){
                        Intent intent = new Intent(Activity_abecedario.this, MuestraAbecedario.class);

                        intent.putExtra("letra", "E");
                        startActivity(intent);
                    }else if (conteo == 5){
                        Intent intent = new Intent(Activity_abecedario.this, MuestraAbecedario.class);

                        intent.putExtra("letra", "F");
                        startActivity(intent);
                    }else if (conteo == 6){
                        Intent intent = new Intent(Activity_abecedario.this, MuestraAbecedario.class);

                        intent.putExtra("letra", "G");
                        startActivity(intent);
                    }else if (conteo == 7){
                        Intent intent = new Intent(Activity_abecedario.this, MuestraAbecedario.class);

                        intent.putExtra("letra", "H");
                        startActivity(intent);
                    }else if (conteo == 8){
                        Intent intent = new Intent(Activity_abecedario.this, MuestraAbecedario.class);

                        intent.putExtra("letra", "I");
                        startActivity(intent);
                    }else if (conteo == 9){
                        Intent intent = new Intent(Activity_abecedario.this, MuestraAbecedario.class);

                        intent.putExtra("letra", "J");
                        startActivity(intent);
                    }else if (conteo == 10){
                        Intent intent = new Intent(Activity_abecedario.this, MuestraAbecedario.class);

                        intent.putExtra("letra", "K");
                        startActivity(intent);
                    }else if (conteo == 11){
                        Intent intent = new Intent(Activity_abecedario.this, MuestraAbecedario.class);

                        intent.putExtra("letra", "L");
                        startActivity(intent);
                    }else if (conteo == 12){
                        Intent intent = new Intent(Activity_abecedario.this, MuestraAbecedario.class);

                        intent.putExtra("letra", "M");
                        startActivity(intent);
                    }else if (conteo == 13){
                        Intent intent = new Intent(Activity_abecedario.this, MuestraAbecedario.class);

                        intent.putExtra("letra", "N");
                        startActivity(intent);
                    }else if (conteo == 14){
                        Intent intent = new Intent(Activity_abecedario.this, MuestraAbecedario.class);

                        intent.putExtra("letra", "Ñ");
                        startActivity(intent);
                    }else if (conteo == 15){
                        Intent intent = new Intent(Activity_abecedario.this, MuestraAbecedario.class);

                        intent.putExtra("letra", "O");
                        startActivity(intent);
                    }else if (conteo == 16){
                        Intent intent = new Intent(Activity_abecedario.this, MuestraAbecedario.class);

                        intent.putExtra("letra", "P");
                        startActivity(intent);
                    }else if (conteo == 17){
                        Intent intent = new Intent(Activity_abecedario.this, MuestraAbecedario.class);

                        intent.putExtra("letra", "Q");
                        startActivity(intent);
                    }else if (conteo == 18){
                        Intent intent = new Intent(Activity_abecedario.this, MuestraAbecedario.class);

                        intent.putExtra("letra", "R");
                        startActivity(intent);
                    }else if (conteo == 19){
                        Intent intent = new Intent(Activity_abecedario.this, MuestraAbecedario.class);

                        intent.putExtra("letra", "S");
                        startActivity(intent);
                    }else if (conteo == 20){
                        Intent intent = new Intent(Activity_abecedario.this, MuestraAbecedario.class);

                        intent.putExtra("letra", "T");
                        startActivity(intent);
                    }else if (conteo == 21){
                        Intent intent = new Intent(Activity_abecedario.this, MuestraAbecedario.class);

                        intent.putExtra("letra", "U");
                        startActivity(intent);
                    }else if (conteo == 22){
                        Intent intent = new Intent(Activity_abecedario.this, MuestraAbecedario.class);

                        intent.putExtra("letra", "V");
                        startActivity(intent);
                    }else if (conteo == 23){
                        Intent intent = new Intent(Activity_abecedario.this, MuestraAbecedario.class);

                        intent.putExtra("letra", "W");
                        startActivity(intent);
                    }else if (conteo == 24){
                        Intent intent = new Intent(Activity_abecedario.this, MuestraAbecedario.class);

                        intent.putExtra("letra", "X");
                        startActivity(intent);
                    }else if (conteo == 25){
                        Intent intent = new Intent(Activity_abecedario.this, MuestraAbecedario.class);

                        intent.putExtra("letra", "Y");
                        startActivity(intent);
                    }else if (conteo == 26){
                        Intent intent = new Intent(Activity_abecedario.this, MuestraAbecedario.class);

                        intent.putExtra("letra", "Z");
                        startActivity(intent);
                    }
                }
            });
        }
    }
}
