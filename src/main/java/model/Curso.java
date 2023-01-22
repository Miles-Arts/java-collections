package model;

import com.alura.model.Aula;

import java.util.LinkedList;
import java.util.List;

public class Curso{
    private String nombre;
    private int  tiempo;
    //private List<Aula> aulaLista = new ArrayList<>();
    private List<Aula> aulaLista = new LinkedList<>();

    public Curso(String nombre, int tiempo) {
        this.nombre = nombre;
        this.tiempo = tiempo;
    }

    publFic Curso(String nombre, int tiempo, List<Aula> aulaList) {
        this.nombre = nombre;
        this.tiempo = tiempo;
        this.aulaLista = aulaList;
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

    public List<Aula> getClaseLista() {
        return aulaLista;
    }

    public void setClaseLista(List<Aula> aulaLista) {
        this.aulaLista = aulaLista;
    }

    public void addClase(Aula aula){
        this.aulaLista.add(aula);
    };

    @Override
    public String toString() {
        return this.nombre;
    }



    /*@Override
    public int compareTo(Curso o) {
        return this.nombre.compareTo(o.getNombre());
    }*/
}
