package com.example.rafaelcidro.startprogramy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class LoginPlay extends AppCompatActivity {

    public Spinner spnCidade;
    public List<String> lCidade = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        spnCidade = (Spinner) findViewById(R.id.spinner);
        lCidade.add("Juazeiro do Norte - Ceará");


      ArrayAdapter<String> dataAdapterCidades = new ArrayAdapter<String>(LoginPlay.this, R.layout.support_simple_spinner_dropdown_item, lCidade);
      dataAdapterCidades.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
      spnCidade.setAdapter(dataAdapterCidades);


        //Button btPlay =

    }
}
