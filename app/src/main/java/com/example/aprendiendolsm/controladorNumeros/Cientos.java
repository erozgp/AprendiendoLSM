package com.example.aprendiendolsm.controladorNumeros;

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
 * Use the {@link Cientos#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Cientos extends Fragment {

    GridLayout MenuGridCIENTOS;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Cientos() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Cientos.
     */
    // TODO: Rename and change types and number of parameters
    public static Cientos newInstance(String param1, String param2) {
        Cientos fragment = new Cientos();
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

        View view = inflater.inflate(R.layout.fragment_cientos, container, false);
        MenuGridCIENTOS= (GridLayout)view.findViewById(R.id.MenuLayoutCientos);
        //Evento
        setSingleEvent(MenuGridCIENTOS);
        // Inflate the layout for this fragment
        return view;
    }

    private void setSingleEvent(GridLayout menuGrid) {
        //Recorro todos los items de MenuGrid
        for (int i = 0; i<MenuGridCIENTOS.getChildCount();i++){
            //Cast el objeto devuelto a CardView
            CardView cardView = (CardView)MenuGridCIENTOS.getChildAt(i);
            final int conteo = i;
            cardView.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (conteo == 0){
                        Intent intent = new Intent(getActivity(), MuestraNumeros.class);
                        int num = 100;
                        intent.putExtra("numero", num);
                        startActivity(intent);
                    } else if (conteo == 1){
                        Intent intent = new Intent(getActivity(), MuestraNumeros.class);
                        int num = 200;
                        intent.putExtra("numero", num);
                        startActivity(intent);
                    }else if (conteo == 2){
                        Intent intent = new Intent(getActivity(), MuestraNumeros.class);
                        int num = 300;
                        intent.putExtra("numero", num);
                        startActivity(intent);
                    }else if (conteo == 3){
                        Intent intent = new Intent(getActivity(), MuestraNumeros.class);
                        int num = 400;
                        intent.putExtra("numero", num);
                        startActivity(intent);
                    }else if (conteo == 4){
                        Intent intent = new Intent(getActivity(), MuestraNumeros.class);
                        int num = 500;
                        intent.putExtra("numero", num);
                        startActivity(intent);
                    }else if (conteo == 5){
                        Intent intent = new Intent(getActivity(), MuestraNumeros.class);
                        int num = 600;
                        intent.putExtra("numero", num);
                        startActivity(intent);
                    }else if (conteo == 6){
                        Intent intent = new Intent(getActivity(), MuestraNumeros.class);
                        int num = 700;
                        intent.putExtra("numero", num);
                        startActivity(intent);
                    }else if (conteo == 7){
                        Intent intent = new Intent(getActivity(), MuestraNumeros.class);
                        int num = 800;
                        intent.putExtra("numero", num);
                        startActivity(intent);
                    }else if (conteo == 8){
                        Intent intent = new Intent(getActivity(), MuestraNumeros.class);
                        int num = 900;
                        intent.putExtra("numero", num);
                        startActivity(intent);
                    }else if (conteo == 9){
                        Intent intent = new Intent(getActivity(), MuestraNumeros.class);
                        int num = 1000;
                        intent.putExtra("numero", num);
                        startActivity(intent);
                    }
                }
            });
        }
    }
}