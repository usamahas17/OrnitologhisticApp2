package com.example.ornitologhisticapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText nombre, clave;
    ConexionUsuario usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre = findViewById(R.id.entradanombre);
        clave = findViewById(R.id.entradaclave);
        usuario = new ConexionUsuario(this);


    }
    public  void registrar  (View l){
        Intent in = new Intent(getApplicationContext(),Registrousuario.class);
        startActivity(in);
    }
    public void entrar(View v){
        String nom,clav;
        nom= nombre.getText().toString();
        clav = clave.getText().toString();
        if(nom.equals("") && clav.equals("")){
            Toast.makeText(this,"campos vacios",Toast.LENGTH_LONG).show();

        }else if (usuario.login(nom,clav)==1){
            Toast.makeText(this,"campos reoconocido",Toast.LENGTH_LONG).show();
            Intent s = new Intent(getApplicationContext(),Registroornitologo.class);
            startActivity(s);

        }


    }
}