package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

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

    }
}
