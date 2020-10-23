package com.example.ornitologhisticapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Registrousuario extends AppCompatActivity {
    EditText nombre,clave,apellido,genero,nacimiento;
    ConexionUsuario conecion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrousuario);
        nombre = findViewById(R.id.entradannom);
        clave= findViewById(R.id.entradaclav);
        apellido = findViewById(R.id.entraapellido);
        genero = findViewById(R.id.entradagenero);
        nacimiento = findViewById(R.id.entradanacimiento);
        conecion = new ConexionUsuario(this);

    }
    public void save(View j){
        Usuario us = new Usuario();
        us.setNombre(nombre.getText().toString());
        us.setClave(clave.getText().toString());
        conecion.insertar(us);
        Toast.makeText(this,"campo ingresado",Toast.LENGTH_LONG).show();
        Intent intento = new Intent(getApplicationContext(),Registroornitologo.class);
        startActivity(intento);

    }
}