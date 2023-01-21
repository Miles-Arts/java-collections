package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Ejemplo5 {


    public static void main(String[] args) {

        Curso curso1 = new Curso("Ruby", 30);
        Curso curso2 = new Curso("PHP", 10);
        Curso curso3 = new Curso("JavaScript", 20);
        Curso curso4 = new Curso("Java", 50);

        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);

        System.out.println("Usando class y Array List");
        System.out.println(cursos);

        //Iteración normal
        Collections.sort(cursos);
        //Iteración reverse
        Collections.sort(cursos, Collections.reverseOrder());
        System.out.println(cursos);

        cursos.sort(Comparator.comparing(Curso::getNombre));
        System.out.println(cursos);

    }
}