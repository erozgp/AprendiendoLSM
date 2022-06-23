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
 * Use the {@link Verduras#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Verduras extends Fragment {

    GridLayout MenuGridfVERDURAS;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Verduras() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Verduras.
     */
    // TODO: Rename and change types and number of parameters
    public static Verduras newInstance(String param1, String param2) {
        Verduras fragment = new Verduras();
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
        View view = inflater.inflate(R.layout.fragment_verduras, container, false);
        MenuGridfVERDURAS = (GridLayout)view.findViewById(R.id.MenuLayoutVerduras);
        //Evento
        setSingleEvent(MenuGridfVERDURAS);
        // Inflate the layout for this fragment
        return view;
    }
    private void setSingleEvent(GridLayout menuGrid) {
        //Recorro todos los items de MenuGrid
        for (int i = 0; i<MenuGridfVERDURAS.getChildCount();i++){
            //Cast el objeto devuelto a CardView
            CardView cardView = (CardView)MenuGridfVERDURAS.getChildAt(i);
            final int conteo = i;
            cardView.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (conteo == 0){
                        Intent intent = new Intent(getActivity(), MuestraFV.class);

                        intent.putExtra("verdura", "Aguacate");
                        startActivity(intent);
                    } else if (conteo == 1){
                        Intent intent = new Intent(getActivity(), MuestraFV.class);

                        intent.putExtra("verdura", "Ajo");
                        startActivity(intent);
                    }else if (conteo == 2){
                        Intent intent = new Intent(getActivity(), MuestraFV.class);

                        intent.putExtra("verdura", "Berenjena");
                        startActivity(intent);
                    }else if (conteo == 3){
                        Intent intent = new Intent(getActivity(), MuestraFV.class);

                        intent.putExtra("verdura", "Calabaza");
                        startActivity(intent);
                    }else if (conteo == 4){
                        Intent intent = new Intent(getActivity(), MuestraFV.class);

                        intent.putExtra("verdura", "Cebolla");
                        startActivity(intent);
                    }else if (conteo == 5){
                        Intent intent = new Intent(getActivity(), MuestraFV.class);

                        intent.putExtra("verdura", "Champiñón");
                        startActivity(intent);
                    }else if (conteo == 6){
                        Intent intent = new Intent(getActivity(), MuestraFV.class);

                        intent.putExtra("verdura", "Chayote");
                        startActivity(intent);
                    }else if (conteo == 7){
                        Intent intent = new Intent(getActivity(), MuestraFV.class);

                        intent.putExtra("verdura", "Chile");
                        startActivity(intent);
                    }else if (conteo == 8){
                        Intent intent = new Intent(getActivity(), MuestraFV.class);

                        intent.putExtra("verdura", "Cilantro");
                        startActivity(intent);
                    }else if (conteo == 9){
                        Intent intent = new Intent(getActivity(), MuestraFV.class);

                        intent.putExtra("verdura", "Coliflor");
                        startActivity(intent);
                    }else if (conteo == 10){
                        Intent intent = new Intent(getActivity(), MuestraFV.class);

                        intent.putExtra("verdura", "Ejote");
                        startActivity(intent);
                    }else if (conteo == 11){
                        Intent intent = new Intent(getActivity(), MuestraFV.class);

                        intent.putExtra("verdura", "Elote");
                        startActivity(intent);
                    }else if (conteo == 12){
                        Intent intent = new Intent(getActivity(), MuestraFV.class);

                        intent.putExtra("verdura", "Espinaca");
                        startActivity(intent);
                    }else if (conteo == 13){
                        Intent intent = new Intent(getActivity(), MuestraFV.class);

                        intent.putExtra("verdura", "Jitomate");
                        startActivity(intent);
                    }else if (conteo == 14){
                        Intent intent = new Intent(getActivity(), MuestraFV.class);

                        intent.putExtra("verdura", "Lechuga");
                        startActivity(intent);
                    }else if (conteo == 15){
                        Intent intent = new Intent(getActivity(), MuestraFV.class);

                        intent.putExtra("verdura", "Papa");
                        startActivity(intent);
                    }else if (conteo == 16){
                        Intent intent = new Intent(getActivity(), MuestraFV.class);

                        intent.putExtra("verdura", "Pepino");
                        startActivity(intent);
                    }else if (conteo == 17){
                        Intent intent = new Intent(getActivity(), MuestraFV.class);

                        intent.putExtra("verdura", "Tomate");
                        startActivity(intent);
                    }else if (conteo == 18){
                        Intent intent = new Intent(getActivity(), MuestraFV.class);

                        intent.putExtra("verdura", "Zanahoria");
                        startActivity(intent);
                    }
                }
            });
        }
    }
}