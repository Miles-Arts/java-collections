package com.alura.model;

public class Aula {

    private String nombre;

    public Aula(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /*public int getTiempo() {
        return tiempo;
    }*/

    /*public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }*/

    @Override
    public String toString(){
        return this.nombre;
    };
    /*@Override
    public int compareTo(Curso o) {
        return this.nombre.compareTo(o.getNombre());
    }*/
}
