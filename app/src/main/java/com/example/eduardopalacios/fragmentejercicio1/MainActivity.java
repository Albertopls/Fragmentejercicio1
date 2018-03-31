package com.example.eduardopalacios.fragmentejercicio1;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Comunicador {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void enviarDatos(String mensaje) {

        //Haciendo uso de FragmentManager se podran colocar los fragmentos ala actividad
        android.app.FragmentManager fragmentManager=getFragmentManager();
        FragmentB fragmentB= (FragmentB) fragmentManager.findFragmentById(R.id.fragmentB);

        //la variable mensaje contendra el resultado de la suma que se hizo en el fragmentA
        //y por lógica dicho valor viene de FragmentA
        //el valor de la variable mensaje  debe ser pasado al metodo colocarResultado para que este lo pueda pasar al FragmentB
        fragmentB.colocarResultado(mensaje);



    }
}
