package com.example.aprendiendolsm.controladorCalendario;

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
 * Use the {@link Meses#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Meses extends Fragment {

    GridLayout MenuGridMESES;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Meses() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Meses.
     */
    // TODO: Rename and change types and number of parameters
    public static Meses newInstance(String param1, String param2) {
        Meses fragment = new Meses();
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
        View view = inflater.inflate(R.layout.fragment_meses, container, false);

        MenuGridMESES = (GridLayout)view.findViewById(R.id.MenuLayoutMeses);
        //Evento
        setSingleEvent(MenuGridMESES);
        // Inflate the layout for this fragment
        return view;
    }
    private void setSingleEvent(GridLayout menuGrid) {
        //Recorro todos los items de MenuGrid
        for (int i = 0; i<MenuGridMESES.getChildCount();i++){
            //Cast el objeto devuelto a CardView
            CardView cardView = (CardView)MenuGridMESES.getChildAt(i);
            final int conteo = i;
            cardView.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (conteo == 0){
                        Intent intent = new Intent(getActivity(), MuestraCalendario.class);

                        intent.putExtra("calen", "enero");
                        startActivity(intent);
                    } else if (conteo == 1){
                        Intent intent = new Intent(getActivity(), MuestraCalendario.class);

                        intent.putExtra("calen", "febrero");
                        startActivity(intent);
                    }else if (conteo == 2){
                        Intent intent = new Intent(getActivity(), MuestraCalendario.class);

                        intent.putExtra("calen", "marzo");
                        startActivity(intent);
                    }else if (conteo == 3){
                        Intent intent = new Intent(getActivity(), MuestraCalendario.class);

                        intent.putExtra("calen", "abril");
                        startActivity(intent);
                    }else if (conteo == 4){
                        Intent intent = new Intent(getActivity(), MuestraCalendario.class);

                        intent.putExtra("calen", "mayo");
                        startActivity(intent);
                    }else if (conteo == 5){
                        Intent intent = new Intent(getActivity(), MuestraCalendario.class);

                        intent.putExtra("calen", "junio");
                        startActivity(intent);
                    }else if (conteo == 6){
                        Intent intent = new Intent(getActivity(), MuestraCalendario.class);

                        intent.putExtra("calen", "julio");
                        startActivity(intent);
                    }else if (conteo == 7){
                        Intent intent = new Intent(getActivity(), MuestraCalendario.class);

                        intent.putExtra("calen", "agosto");
                        startActivity(intent);
                    }else if (conteo == 8){
                        Intent intent = new Intent(getActivity(), MuestraCalendario.class);

                        intent.putExtra("calen", "septiembre");
                        startActivity(intent);
                    }else if (conteo == 9){
                        Intent intent = new Intent(getActivity(), MuestraCalendario.class);

                        intent.putExtra("calen", "octubre");
                        startActivity(intent);
                    }else if (conteo == 10){
                        Intent intent = new Intent(getActivity(), MuestraCalendario.class);

                        intent.putExtra("calen", "noviembre");
                        startActivity(intent);
                    }else if (conteo == 11){
                        Intent intent = new Intent(getActivity(), MuestraCalendario.class);

                        intent.putExtra("calen", "diciembre");
                        startActivity(intent);
                    }
                }
            });
        }
    }
}