package model;

import com.alura.model.Alumno;
import com.alura.model.Aula;

import java.util.*;

public class Curso{
    private String nombre;
    private int  tiempo;
    private List<Aula> aulaLista = new ArrayList<>();
    private Collection<Alumno> alumnos = new HashSet<>();
    //private Collection<Alumno> alumnos = new LinkedHashSet<>();

    //private Map<String, Alumno> alumnoMap = new HashMap<>();
    private Map<String, Alumno> alumnoMap = new LinkedHashMap<>();



    public Curso(String nombre, int tiempo ) {
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

    public void addAlumno(Alumno alumno) { this.alumnos.add(alumno); this.alumnoMap.put(alumno.getCodigo(), alumno);}

    public boolean verificaAlumno(Alumno alumno) { return this.alumnos.contains(alumno);}
    @Override
    public String toString() {
        return this.nombre;
    }

    public Collection<Alumno> getAlumnos() {
        return alumnos;
    }

    public Map<String, Alumno> getAlumnoMap() {
        return alumnoMap;
    }


/*@Override
    public int compareTo(Curso o) {
        return this.nombre.compareTo(o.getNombre());
    }*/
}
