package model;

import com.alura.model.Aula;

import java.util.ArrayList;
import java.util.List;

public class Curso{
    private String nombre;
    private int  tiempo;
    private List<Aula> aulaLista = new ArrayList<>();


    public Curso(String nombre, int tiempo) {
        this.nombre = nombre;
        this.tiempo = tiempo;
    }

    public Curso(String nombre, int tiempo, List<Aula> aulaLista) {
        this.nombre = nombre;
        this.tiempo = tiempo;
        this.aulaLista = aulaLista;
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

    public List<Aula> getAulaLista() {
        //return Collections.unmodifiableList(aulaLista);
        return aulaLista;
    }

    public void setAulaLista(List<Aula> aulaLista) {
        this.aulaLista = aulaLista;
    }

    public void addAula(Aula aula){
        this.aulaLista.add(aula);
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
