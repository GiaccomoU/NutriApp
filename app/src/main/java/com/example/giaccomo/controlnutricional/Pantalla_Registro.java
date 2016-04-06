package com.example.giaccomo.controlnutricional;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


import java.util.ArrayList;

public class Pantalla_Registro extends AppCompatActivity {

    Spinner spinnerEdad;
    Spinner spinnerPeso;
    Spinner spinnerAltura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla__registro);

        spinnerEdad = (Spinner) findViewById(R.id.spinnerEdad);
        Integer[] itemsEdad = new Integer[]{10,11,12,13,14,15,16,17,18,19,
                                            20,21,22,23,24,25,26,27,28,29,
                                            30,31,32,33,34,35,36,37,38,39,
                                            40,41,42,43,44,45,46,47,48,49,
                                            50,51,52,53,54,55,56,57,58,59,
                                            60,61,62,63,64,65,66,67,68,69,
                                            70,71,72,73,74,75,76,77,78,79,
                                            80,81,82,83,84,85,86,87,88,89,
                                            90,91,92,93,94,95,96,97,98,99};
        ArrayAdapter<Integer> adaptadorEdad = new ArrayAdapter<Integer>(this, android.R.layout.simple_spinner_item, itemsEdad);
        spinnerEdad.setAdapter(adaptadorEdad);
        spinnerPeso = (Spinner) findViewById(R.id.spinnerPeso);
        ArrayList<Integer> itemsPeso = new ArrayList<Integer>();
        for(int i=20; i<201; i++){
            itemsPeso.add(i);
        }
        ArrayAdapter<Integer> adaptadorPeso = new ArrayAdapter<Integer>(this, android.R.layout.simple_spinner_item, itemsPeso);
        spinnerPeso.setAdapter(adaptadorPeso);
        spinnerAltura = (Spinner) findViewById(R.id.spinnerAltura);
        ArrayList<Integer> itemsAltura = new ArrayList<Integer>();
        for(int i=130; i<231; i++){
            itemsAltura.add(i);
        }
        ArrayAdapter<Integer> adaptadorAltura = new ArrayAdapter<Integer>(this, android.R.layout.simple_spinner_item, itemsEdad);
        spinnerAltura.setAdapter(adaptadorAltura);



    }


}
