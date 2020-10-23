package com.example.ornitologhisticapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import java.util.ArrayList;

public class Recicla extends AppCompatActivity {
    RecyclerView recicla;
    Conexionornitologo ornitologo;
    ArrayList<Ornitologo> listaornitologo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recicla);
        ornitologo =  new Conexionornitologo(this,"nombredb",null,1);
        listaornitologo = new ArrayList<>();
        recicla = findViewById(R.id.recicler);
        recicla.setLayoutManager(new LinearLayoutManager(this));
        listado();
        Pegamento  pega = new Pegamento(listaornitologo);
        recicla.setAdapter(pega);
    }
    public void listado(){
        SQLiteDatabase db = ornitologo.getReadableDatabase();
        Ornitologo or = null;
        Cursor c = db.rawQuery("SELECT * FROM aves",null);
        while(c.moveToNext()){
            or = new Ornitologo();
            or.setId(c.getInt(0));
            or.setAve(c.getString(1));
            or.setFecha(c.getString(2));
            or.setDescricpcion(c.getString(3));
            listaornitologo.add(or);

        }
    }
}