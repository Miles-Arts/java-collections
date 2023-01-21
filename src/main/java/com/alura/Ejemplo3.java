package com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Ejemplo3 {


    public static void main(String[] args) {


        String curso1 = "Geometría";
        String curso2 = "Física";
        String curso3 = "Química";
        String curso4 = "Historia";

        ArrayList<String> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);


        //MÉTODOS ADICIONALES
        System.out.println("Orden normal ");
        System.out.println(cursos);

        //Class Collection
        //SORT orden ascendente  MENOR A MAYOR
        System.out.println("SORT para orden ascendente ");
        Collections.sort(cursos);
        System.out.println(cursos);

        //SORT DESCENDENTE
        System.out.println("reverseOrder para orden descendente ");
        Collections.sort(cursos, Collections.reverseOrder());
        System.out.println(cursos);

        //METODOS DE array List
        cursos.sort(Comparator.reverseOrder());
        System.out.println("Ordenar con ArrayList y SORT ");
        System.out.println(cursos);

        //METODOS DE array List menor a MAYOR
            cursos.sort(Comparator.naturalOrder());
            System.out.println("Ordenar con NATURAL ArrayList y SORT ");
            System.out.println(cursos);


        //CON STRINGS
        //cursos.stream().sorted().collect(Collectors.toList());
        List<String> cursosList = cursos.stream().sorted().collect(Collectors.toList());
        System.out.println("Ordenar Strings con STREAM  y TO LIST");
        System.out.println(cursosList);

    }
}
