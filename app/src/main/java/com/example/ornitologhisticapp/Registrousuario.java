package com.example.ornitologhisticapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Registrousuario extends AppCompatActivity {
    EditText nombre,clave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrousuario);
        nombre = findViewById(R.id.entradannom);
        clave= findViewById(R.id.entradaclav);

    }
    public void save(View j){


        Intent k = new Intent(getApplicationContext(),Registroornitologo.class);
        startActivity(k);
    }
}