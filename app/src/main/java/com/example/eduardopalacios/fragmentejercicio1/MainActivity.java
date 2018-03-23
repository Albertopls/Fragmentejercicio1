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

        android.app.FragmentManager fragmentManager=getFragmentManager();
        FragmentB fragmentB= (FragmentB) fragmentManager.findFragmentById(R.id.fragmentB);
        fragmentB.colocarResultado(mensaje);



    }
}
