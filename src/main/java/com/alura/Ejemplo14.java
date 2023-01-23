package com.alura;

import com.alura.model.Alumno;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;

public class Ejemplo14 {

    // TODO

    public static void main(String[] args) {

        System.out.println("----");

        Alumno alumno1 = new Alumno("Luis Miguel", codigo: "001");
        Alumno alumno2 = new Alumno("Pepito Juan Palotes", codigo: "002");
        Alumno alumno3 = new Alumno("Juan Carlos", codigo: "003");
        Alumno alumno4 = new Alumno("Pedro Pink", codigo: "004");
        Alumno alumno5 = new Alumno("Gustavo Sanchez", codigo: "005");
        Alumno alumno6 = new Alumno("Marcia María", codigo: "006");
        String alumno7 = new Alumno("Claudia María", codigo: "007");

        //NO EXISTE LA POSIICÓN GET EN SET
        //listaAlumnos.get();

        // set no acepta elementos duplicados
        //Set<String> listaAlumnos = new HashSet<>();
        Collection<String> listaAlumnos = new HashSet<>();
        //Collection<String> listaAlumnos = new ArrayList<>();

        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);
        listaAlumnos.add(alumno5);
        listaAlumnos.add(alumno6);
        listaAlumnos.add(alumno7);

        /*for (String alumno : listaAlumnos) {
            System.out.println(alumno);
        }*/

        System.out.println("----");

        //contains devuelve un BOOLEAN
        //busca elementos iguales en lista para TRUE
        // si no hay devuelve  FALSE
        boolean valida = listaAlumnos.contains("Pedro ink");

        System.out.println(valida);

        //Para saber el elementos de mayor tamaño String o Int
        String max = listaAlumnos.stream().max(Comparator.comparingInt(String::length)).get();

        System.out.println(max);
        System.out.println("----");
        //MAX . LENGTH - para saber el números de caracteres del objeto String mayor
        System.out.println(max.length());

        System.out.println("----");


        //Elimina de la lista un elemento elegido
        //primero se pone el elemento a eliminar para evitar NULL
        listaAlumnos.removeIf(alumno -> "Pedro Pin".equalsIgnoreCase(alumno));

        listaAlumnos.forEach(alumno -> {
            System.out.println(alumno);
        });

        System.out.println("----");

    }

}
