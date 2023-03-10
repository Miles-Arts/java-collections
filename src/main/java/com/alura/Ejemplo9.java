package com.alura;

import model.Curso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ejemplo9 {
    public static void main(String[] args) {

        Curso curso1 = new Curso("Historia", 30);
        Curso curso2 = new Curso("Algebra", 10);
        Curso curso3 = new Curso("Arimética", 20);
        Curso curso4 = new Curso("Geometría", 50);

        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);

        System.out.println("Sumando tiempo con Collection ");

        Collections.sort(cursos,Comparator.comparing(Curso::getNombre).reversed());

        //int tiempo = 0;
        int suma = 0;
        for (Curso curso: cursos ) {
            if(!curso.getNombre().equalsIgnoreCase("Historia")) {
                //tiempo += curso.getTiempo();
                suma += curso.getTiempo();
            };
        }

        //System.out.println(tiempo);
        System.out.println(suma);
        //System.out.println(cursos);

        List<Curso> cursoLista = cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("Ruby")).sorted(Comparator.comparingInt(Curso::getTiempo)).collect(Collectors.toList());


        System.out.println("Sumando tiempo con Streams");
        //System.out.println(cursos.stream().mapToInt(Curso::getTiempo).sum());
        //System.out.println(cursos.stream().mapToInt(Curso::getTiempo).max());
        //System.out.println(cursos.stream().mapToInt(Curso::getTiempo).max().getAsInt());


        //Filter para elimar un objeto de List
        System.out.println(cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("Historia")).mapToInt(Curso::getTiempo).sum());


        //Streams sirve para ahorra código y evitar hacer funciones innecesarias
        System.out.println("Streams sirve para ahorra código y evitar hacer funciones innecesarias");
    }
}