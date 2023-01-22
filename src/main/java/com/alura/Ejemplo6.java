package com.alura;

import com.alura.model.Aula;
import model.Curso;

import java.util.ArrayList;

public class Ejemplo6 {

    public static void main(String[] args) {

        //Curso curso1 = new Curso("Java", 30, new ArrayList<>());
        Curso curso1 = new Curso("Java", 30);
        curso1.addClase(new Aula("ArrayList"));
        curso1.addClase(new Aula("List"));
        curso1.addClase(new Aula("LinkedList"));

        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);

        System.out.println(cursos.get(0).getClaseLista());

    }
}