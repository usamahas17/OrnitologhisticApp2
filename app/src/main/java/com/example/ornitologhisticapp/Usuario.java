package com.example.ornitologhisticapp;

public class Usuario {
    String nombre ,clave;
    int id;
    public  Usuario(){

    }
    public Usuario(String nombre , String clave,int id){
        this.clave = clave;
        this.nombre = nombre;
        this.id = id;


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
