package com.alura;

import java.util.HashSet;
import java.util.Set;

public class Ejemplo11 {

    // TODO

    public static void main(String[] args) {


        String alumno1 = "Luis Miguel";
        String alumno2 = "Pepito Juan";
        String alumno3 = "Juan Carlos";
        String alumno4 = "Pedro Pink";
        String alumno5 = "Gustavo Sanchez";
        String alumno6 = "Marcia María";

        Set<String> listaAlumnos = new HashSet<>();

        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);
        listaAlumnos.add(alumno5);
        listaAlumnos.add(alumno6);

    for(String alumno: listaAlumnos) {

        System.out.println(alumno);
    }


        System.out.println("----");
    }

}
