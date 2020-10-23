package com.example.ornitologhisticapp;

import androidx.annotation.VisibleForTesting;

public class Ornitologo {
    String ave , fecha,descricpcion;
    int id;
    public  Ornitologo (){

    }
    public Ornitologo(String ave , String fecha, String descripcion, int id){
        this.ave = ave;
        this.fecha = fecha;
        this.descricpcion = descripcion;
        this.id= id;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricpcion() {
        return descricpcion;
    }

    public void setDescricpcion(String descricpcion) {
        this.descricpcion = descricpcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getAve() {
        return ave;
    }

    public void setAve(String ave) {
        this.ave = ave;
    }
}
