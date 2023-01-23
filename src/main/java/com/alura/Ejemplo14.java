package com.alura;

import com.alura.model.Alumno;

import java.util.ArrayList;
import java.util.Collection;

public class Ejemplo14 {

    public static void main(String[] args) {

        //System.out.println("----");


        Alumno alumno1 = new Alumno("Luis Miguel",  "001");
        Alumno alumno2 = new Alumno("Pepito Juan Palotes",  "002");
        Alumno alumno3 = new Alumno("Juan Carlos",  "003");
        Alumno alumno4 = new Alumno("Pedro Pink",  "004");
        Alumno alumno5 = new Alumno("Gustavo Sanchez",  "005");
        Alumno alumno6 = new Alumno("Marcia María",  "006");
        Alumno alumno7 = new Alumno("Claudia María",  "007");



       //Collection<Alumno> listaAlumnos = new HashSet<>();
        Collection<Alumno> listaAlumnos = new ArrayList<>();

        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);
        listaAlumnos.add(alumno5);
        listaAlumnos.add(alumno6);
        listaAlumnos.add(alumno7);
        //listaAlumnos.add(alumnoNuevo);

        Alumno alumnoNuevo = new Alumno("Luis Miguel",  "001");

        System.out.println("----");

        System.out.println(alumno1.equals(alumnoNuevo));
        System.out.println("----");
        System.out.println(listaAlumnos.contains(alumnoNuevo));


        System.out.println("----");



        //ystem.out.println("----");

    }

}
