package com.alura;

import java.util.Collection;
import java.util.HashSet;

public class Ejemplo12 {

    // TODO

    public static void main(String[] args) {

        System.out.println("----");

        String alumno1 = "Luis Miguel";
        String alumno2 = "Pepito Juan";
        String alumno3 = "Juan Carlos";
        String alumno4 = "Pedro Pink";
        String alumno5 = "Gustavo Sanchez";
        String alumno6 = "Marcia María";
        String alumno7 = "Marcia María";

        //NO EXISTE LA POSIICÓN GET EN SET
        //listaAlumnos.get();

        // set no acepta elementos duplicados
        //Set<String> listaAlumnos = new HashSet<>();
        Collection<String> listaAlumnos = new HashSet<>();
        //Collection<String> listaAlumnos = new ArrayList<>();

        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);
        listaAlumnos.add(alumno5);
        listaAlumnos.add(alumno6);
        listaAlumnos.add(alumno7);

    for(String alumno: listaAlumnos) {
        System.out.println(alumno);
    }

        System.out.println("----");

    listaAlumnos.forEach(alumno -> {
        System.out.println(alumno);
    });

        System.out.println("----");
    }

}
