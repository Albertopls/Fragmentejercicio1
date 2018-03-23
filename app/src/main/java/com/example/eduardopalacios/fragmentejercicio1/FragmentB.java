package com.example.eduardopalacios.fragmentejercicio1;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentB extends Fragment {

    TextView resultado;
    View vista;

    public FragmentB() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vista= inflater.inflate(R.layout.fragment_fragment_b, container, false);
        resultado=(TextView)vista.findViewById(R.id.resultado);
        resultado.setText("resultado");
        return vista;
    }

    public void colocarResultado(String reultado)
    {
        resultado.setText(reultado);
    }

}
