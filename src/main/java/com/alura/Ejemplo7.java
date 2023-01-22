package com.alura;

import com.alura.model.Aula;
import model.Curso;

import java.util.ArrayList;
import java.util.List;

public class Ejemplo7 {

    public static void main(String[] args) {

        //Curso curso1 = new Curso("Java", 30, new ArrayList<>());
        Curso curso1 = new Curso("Java", 30);
        curso1.addAula(new Aula("ArrayList"));
        curso1.addAula(new Aula("List"));
        curso1.addAula(new Aula("LinkedList"));

        List<Aula> aulalista = curso1.getAulaLista();

        aulalista.add(new Aula("Inmutable"));

        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);

        System.out.println(cursos.get(0).getAulaLista());

    }
}