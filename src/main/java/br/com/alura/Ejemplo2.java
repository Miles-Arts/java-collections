package br.com.alura;

import java.util.ArrayList;

public class Ejemplo2 {

    public static void main(String[] args) {


        String variable1 = "Clase 1";
        String variable2 = "Clase 2";
        String variable3 = "Clase 3";
        String variable4 = "Clase 4";

        ArrayList<String> listaString = new ArrayList<>();
        listaString.add(variable1);
        listaString.add(variable2);
        listaString.add(variable3);
        listaString.add(variable4);

        System.out.println("Normal");
        System.out.println(listaString);

        //FORMAS DE LEER UN ARRYLIST
        for (int i = 0; i < listaString.size(); i++) {
            System.out.println("Tamaño ");
            System.out.println(listaString.get(i));
        }

    }
}
