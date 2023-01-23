package com.alura;

import com.alura.model.Alumno;
import model.Curso;

public class Ejemplo16 {

    public static void main(String[] args) {

        //System.out.println("----");

        Curso curso1 = new Curso("Historia", 30);

        Alumno alumno1 = new Alumno("Luis Miguel",  "001");
        Alumno alumno2 = new Alumno("Pepito Juan Palotes",  "002");
        Alumno alumno3 = new Alumno("Juan Carlos",  "003");
        Alumno alumno4 = new Alumno("Pedro Pink",  "004");
        Alumno alumno5 = new Alumno("Gustavo Sanchez",  "005");
        Alumno alumno6 = new Alumno("Marcia María",  "006");
        Alumno alumno7 = new Alumno("Claudia María",  "007");

       //Collection<Alumno> listaAlumnos = new HashSet<>();
        //Collection<Alumno> listaAlumnos = new ArrayList<>();

        curso1.addAlumno(alumno1);
        curso1.addAlumno(alumno2);
        curso1.addAlumno(alumno3);
        curso1.addAlumno(alumno4);
        curso1.addAlumno(alumno5);
        curso1.addAlumno(alumno6);
        curso1.addAlumno(alumno7);

        System.out.println("----");

        curso1.getAlumnos().forEach(alumno ->  System.out.println(alumno));

        System.out.println("----");

    }

}
