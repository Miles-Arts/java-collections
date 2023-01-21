package model;

import com.alura.model.Clase;

import java.util.ArrayList;
import java.util.List;

public class Curso{
    private String nombre;
    private int  tiempo;
    private List<Clase> claseLista = new ArrayList<>();


    public Curso(String nombre, int tiempo) {
        this.nombre = nombre;
        this.tiempo = tiempo;
    }

    public Curso(String nombre, int tiempo, List<Clase> claseList) {
        this.nombre = nombre;
        this.tiempo = tiempo;
        this.claseLista = claseList;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public List<Clase> getClaseLista() {
        return claseLista;
    }

    public void setClaseLista(List<Clase> claseLista) {
        this.claseLista = claseLista;
    }

    @Override
    public String toString() {
        return this.nombre;
    }

    /*@Override
    public int compareTo(Curso o) {
        return this.nombre.compareTo(o.getNombre());
    }*/
}
