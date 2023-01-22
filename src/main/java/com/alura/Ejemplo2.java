package com.alura;

import java.util.ArrayList;

public class Ejemplo2 {

    public static void main(String[] args) {


        String variable1 = "Aula 1";
        String variable2 = "Aula 2";
        String variable3 = "Aula 3";
        String variable4 = "Aula 4";

        ArrayList<String> listaString = new ArrayList<>();
        listaString.add(variable1);
        listaString.add(variable2);
        listaString.add(variable3);
        listaString.add(variable4);

        //Imprimiento ArrayList NORMAL
        System.out.println("FORMAS DE LEER UNA LISTA");
        System.out.println("Normal");
        System.out.println(listaString);

        //FORMAS DE LEER UN ARRYLIST
        System.out.println("Tamaño size");
        for (int i = 0; i < listaString.size(); i++) {

            System.out.println(listaString.get(i));
        }
        //FOR EACH
        System.out.println("Tamaño con forEach");
        for (String clase : listaString ) {
            System.out.println(clase);
        }

        //LAMBDAS desde JAVa 8
        System.out.println("Con Lambdas");
        listaString.forEach(clase -> {
            System.out.println(clase);
        });

    }
}
