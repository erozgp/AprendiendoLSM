package com.example.aprendiendolsm.controladorFrutasVerduras;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;

import com.example.aprendiendolsm.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Frutas#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Frutas extends Fragment {

    GridLayout MenuGridfRUTAS;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Frutas() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Frutas.
     */
    // TODO: Rename and change types and number of parameters
    public static Frutas newInstance(String param1, String param2) {
        Frutas fragment = new Frutas();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_frutas, container, false);

        MenuGridfRUTAS = (GridLayout)view.findViewById(R.id.MenuLayoutFrutas);
        //Evento
        setSingleEvent(MenuGridfRUTAS);
        // Inflate the layout for this fragment
        return view;
    }

    private void setSingleEvent(GridLayout menuGrid) {
        //Recorro todos los items de MenuGrid
        for (int i = 0; i<MenuGridfRUTAS.getChildCount();i++){
            //Cast el objeto devuelto a CardView
            CardView cardView = (CardView)MenuGridfRUTAS.getChildAt(i);
            final int conteo = i;
            cardView.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (conteo == 0){
                        Intent intent = new Intent(getActivity(), MuestraFV.class);

                        intent.putExtra("fruta", "Almendra");
                        startActivity(intent);
                    } else if (conteo == 1){
                        Intent intent = new Intent(getActivity(), MuestraFV.class);

                        intent.putExtra("fruta", "Cereza");
                        startActivity(intent);
                    }else if (conteo == 2){
                        Intent intent = new Intent(getActivity(), MuestraFV.class);

                        intent.putExtra("fruta", "Ciruela");
                        startActivity(intent);
                    }else if (conteo == 3){
                        Intent intent = new Intent(getActivity(), MuestraFV.class);

                        intent.putExtra("fruta", "Coco");
                        startActivity(intent);
                    }else if (conteo == 4){
                        Intent intent = new Intent(getActivity(), MuestraFV.class);

                        intent.putExtra("fruta", "Durazno");
                        startActivity(intent);
                    }else if (conteo == 5){
                        Intent intent = new Intent(getActivity(), MuestraFV.class);

                        intent.putExtra("fruta", "Fresa");
                        startActivity(intent);
                    }else if (conteo == 6){
                        Intent intent = new Intent(getActivity(), MuestraFV.class);

                        intent.putExtra("fruta", "Granada");
                        startActivity(intent);
                    }else if (conteo == 7){
                        Intent intent = new Intent(getActivity(), MuestraFV.class);

                        intent.putExtra("fruta", "Guayaba");
                        startActivity(intent);
                    }else if (conteo == 8){
                        Intent intent = new Intent(getActivity(), MuestraFV.class);

                        intent.putExtra("fruta", "Jícama");
                        startActivity(intent);
                    }else if (conteo == 9){
                        Intent intent = new Intent(getActivity(), MuestraFV.class);

                        intent.putExtra("fruta", "Lima");
                        startActivity(intent);
                    }else if (conteo == 10){
                        Intent intent = new Intent(getActivity(), MuestraFV.class);

                        intent.putExtra("fruta", "Limón");
                        startActivity(intent);
                    }else if (conteo == 11){
                        Intent intent = new Intent(getActivity(), MuestraFV.class);

                        intent.putExtra("fruta", "Mamey");
                        startActivity(intent);
                    }else if (conteo == 12){
                        Intent intent = new Intent(getActivity(), MuestraFV.class);

                        intent.putExtra("fruta", "Mandarina");
                        startActivity(intent);
                    }else if (conteo == 13){
                        Intent intent = new Intent(getActivity(), MuestraFV.class);

                        intent.putExtra("fruta", "Mango");
                        startActivity(intent);
                    }else if (conteo == 14){
                        Intent intent = new Intent(getActivity(), MuestraFV.class);

                        intent.putExtra("fruta", "Manzana");
                        startActivity(intent);
                    }else if (conteo == 15){
                        Intent intent = new Intent(getActivity(), MuestraFV.class);

                        intent.putExtra("fruta", "Melón");
                        startActivity(intent);
                    }else if (conteo == 16){
                        Intent intent = new Intent(getActivity(), MuestraFV.class);

                        intent.putExtra("fruta", "Naranja");
                        startActivity(intent);
                    }else if (conteo == 17){
                        Intent intent = new Intent(getActivity(), MuestraFV.class);

                        intent.putExtra("fruta", "Papaya");
                        startActivity(intent);
                    }else if (conteo == 18){
                        Intent intent = new Intent(getActivity(), MuestraFV.class);

                        intent.putExtra("fruta", "Pera");
                        startActivity(intent);
                    }else if (conteo == 19){
                        Intent intent = new Intent(getActivity(), MuestraFV.class);

                        intent.putExtra("fruta", "Piña");
                        startActivity(intent);
                    }else if (conteo == 20){
                        Intent intent = new Intent(getActivity(), MuestraFV.class);

                        intent.putExtra("fruta", "Plátano");
                        startActivity(intent);
                    }else if (conteo == 21){
                        Intent intent = new Intent(getActivity(), MuestraFV.class);

                        intent.putExtra("fruta", "Sandía");
                        startActivity(intent);
                    }else if (conteo == 22){
                        Intent intent = new Intent(getActivity(), MuestraFV.class);

                        intent.putExtra("fruta", "Tamarindo");
                        startActivity(intent);
                    }else if (conteo == 23){
                        Intent intent = new Intent(getActivity(), MuestraFV.class);

                        intent.putExtra("fruta", "Toronja");
                        startActivity(intent);
                    }else if (conteo == 24){
                        Intent intent = new Intent(getActivity(), MuestraFV.class);

                        intent.putExtra("fruta", "Tuna");
                        startActivity(intent);
                    }else if (conteo == 25){
                        Intent intent = new Intent(getActivity(), MuestraFV.class);

                        intent.putExtra("fruta", "Uva");
                        startActivity(intent);
                    }else if (conteo == 26){
                        Intent intent = new Intent(getActivity(), MuestraFV.class);

                        intent.putExtra("fruta", "Zapote");
                        startActivity(intent);
                    }
                }
            });
        }
    }
}