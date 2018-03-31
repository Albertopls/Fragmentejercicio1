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

        //obtenemos la vista o el layout que corresponde al fragment
        // obteniendola de la siguiente manera
        vista=inflater.inflate(R.layout.fragment_, container, false);

        // realizamos un cast para poder hacer uso del metodo que se encuentra en Main activity llamado enviarDatos()
        //el cual corresponde ala interface.(Estudiar el tema de poliformismo para que sea mas entendible esta parte)
        comunicador=(Comunicador)getActivity();

        valor1=(EditText)vista.findViewById(R.id.valor1);
        valor2=(EditText)vista.findViewById(R.id.valor2);
        sumar=(Button)vista.findViewById(R.id.boton);
        sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //obtenemos el metodo que realizara la operacion.
                setSumar();
                //una vez que se hizo la operacion de sumar el valor se almaceno en la variable resultado, posteriormente
                // pasamos el valor al metodo enviarDatos correspondiente a Main activity para que este a su vez lo pase a FragmentB.
                comunicador.enviarDatos(resultado);
            }
        });


        return vista;
    }



    public void setSumar()
    {
        int numero1,numero2;
        numero1=Integer.parseInt(valor1.getText().toString());
        numero2=Integer.parseInt(valor2.getText().toString());

        resultado=String.valueOf(numero1+numero2);
    }

}
