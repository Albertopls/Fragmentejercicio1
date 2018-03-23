package com.example.eduardopalacios.fragmentejercicio1;



import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentA extends Fragment {


    View vista;
    EditText valor1,valor2;
    Button sumar;
    String resultado;
    Comunicador comunicador;
    public FragmentA() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vista=inflater.inflate(R.layout.fragment_, container, false);
        comunicador=(Comunicador)getActivity();

        valor1=(EditText)vista.findViewById(R.id.valor1);
        valor2=(EditText)vista.findViewById(R.id.valor2);
        sumar=(Button)vista.findViewById(R.id.boton);
        sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setSumar();
                comunicador.enviarDatos(resultado);
            }
        });


        return vista;
    }



   // @Override
   // public void onActivityCreated( Bundle savedInstanceState) {
//        super.onActivityCreated(savedInstanceState);

        //Los elementos se asocian con la actividad o ventana una vez creada
  //      comunicador= (Comunicador) getActivity();//Asocimos el activity principal con comunicador (uso de polimorfismo)
    //    valor1=(EditText)getActivity().findViewById(R.id.valor1);
      //  valor2=(EditText)getActivity().findViewById(R.id.valor2);
        //sumar=(Button)getActivity().findViewById(R.id.boton);
        //sumar.setOnClickListener(new View.OnClickListener() {
          //  @Override
            //public void onClick(View view) {
              //  setSumar();

//                comunicador.enviarDatos(resultado);//uso del metodo enviarDatos pero de la actividad NO de la interface

  //          }
    //    });


    //}

    public void setSumar()
    {
        int numero1,numero2;
        numero1=Integer.parseInt(valor1.getText().toString());
        numero2=Integer.parseInt(valor2.getText().toString());

        resultado=String.valueOf(numero1+numero2);
    }

}
