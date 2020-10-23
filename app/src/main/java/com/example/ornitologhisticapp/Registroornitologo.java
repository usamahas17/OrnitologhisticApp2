package com.example.ornitologhisticapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Registroornitologo extends AppCompatActivity {
    EditText ave, fecha, descrip;
    Conexionornitologo conexion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registroornitologo);
        ave = findViewById(R.id.entradaave);
        fecha = findViewById(R.id.entradafecha);
        descrip = findViewById(R.id.entradadescripcion);
        conexion = new Conexionornitologo(this,"nombredb",null,1);
    }
    public  void guardar(View h){
        SQLiteDatabase db = conexion.getWritableDatabase();
        ContentValues valores = new ContentValues();
        valores.put("ave",ave.getText().toString());
        valores.put("fecha",fecha.getText().toString());
        valores.put("descripcion",descrip.getText().toString());
        ave.setText("");
        fecha.setText("");
        descrip.setText("");
        Long result = db.insert("aves","ave",valores);
        Toast.makeText(this,"campo ingresado:" +result,Toast.LENGTH_LONG).show();



    }
    public  void mostrar(View d){
        Intent s = new Intent(getApplicationContext(),Recicla.class);
        startActivity(s);

    }

}