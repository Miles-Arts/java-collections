package com.alura;

import model.Curso;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ejemplo10 {
    public static void main(String[] args) {

        Curso curso1 = new Curso("Historia", 30);
        Curso curso2 = new Curso("Algebra", 10);
        Curso curso3 = new Curso("Arimética", 20);
        Curso curso4 = new Curso("Geometría", 50);
        Curso curso5 = new Curso("Física", 60);
        Curso curso6 = new Curso("Química", 80);
        Curso curso7 = new Curso("Geografía", 70);
        Curso curso8 = new Curso("Educación Física", 30);

        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);
        cursos.add(curso5);
        cursos.add(curso6);
        cursos.add(curso7);
        cursos.add(curso8);

        System.out.println("Streams");

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