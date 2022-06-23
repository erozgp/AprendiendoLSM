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
 * Use the {@link DiasSemana#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DiasSemana extends Fragment {

    GridLayout MenuGridDIASSEMANA;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public DiasSemana() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DiasSemana.
     */
    // TODO: Rename and change types and number of parameters
    public static DiasSemana newInstance(String param1, String param2) {
        DiasSemana fragment = new DiasSemana();
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
        View view = inflater.inflate(R.layout.fragment_dias_semana, container, false);

        MenuGridDIASSEMANA = (GridLayout)view.findViewById(R.id.MenuLayoutDiasSemanas);
        //Evento
        setSingleEvent(MenuGridDIASSEMANA);

        // Inflate the layout for this fragment
        return view;
    }
    private void setSingleEvent(GridLayout menuGrid) {
        //Recorro todos los items de MenuGrid
        for (int i = 0; i<MenuGridDIASSEMANA.getChildCount();i++){
            //Cast el objeto devuelto a CardView
            CardView cardView = (CardView)MenuGridDIASSEMANA.getChildAt(i);
            final int conteo = i;
            cardView.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (conteo == 0){
                        Intent intent = new Intent(getActivity(), MuestraCalendario.class);

                        intent.putExtra("calen", "lunes");
                        startActivity(intent);
                    } else if (conteo == 1){
                        Intent intent = new Intent(getActivity(), MuestraCalendario.class);

                        intent.putExtra("calen", "martes");
                        startActivity(intent);
                    }else if (conteo == 2){
                        Intent intent = new Intent(getActivity(), MuestraCalendario.class);

                        intent.putExtra("calen", "miércoles");
                        startActivity(intent);
                    }else if (conteo == 3){
                        Intent intent = new Intent(getActivity(), MuestraCalendario.class);

                        intent.putExtra("calen", "jueves");
                        startActivity(intent);
                    }else if (conteo == 4){
                        Intent intent = new Intent(getActivity(), MuestraCalendario.class);

                        intent.putExtra("calen", "viernes");
                        startActivity(intent);
                    }else if (conteo == 5){
                        Intent intent = new Intent(getActivity(), MuestraCalendario.class);

                        intent.putExtra("calen", "sábado");
                        startActivity(intent);
                    }else if (conteo == 6){
                        Intent intent = new Intent(getActivity(), MuestraCalendario.class);

                        intent.putExtra("calen", "domingo");
                        startActivity(intent);
                    }
                }
            });
        }
    }
}