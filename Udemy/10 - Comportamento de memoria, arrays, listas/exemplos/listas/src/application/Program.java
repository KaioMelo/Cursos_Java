package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        System.out.println("------- ADICIONAR ---------");


        list.add("Maria");
        list.add("Bob");
        list.add("Teresa");
        list.add(2, "Joana");

        for(String x: list){
            System.out.println(x);
        }

       System.out.println("------- REMOVE ---------");

        list.remove("Bob");
        list.removeIf( x -> x.charAt(0) == 'M');

        for(String x: list){
            System.out.println(x);
        }

        System.out.println("------- TAMANHO ---------");

        System.out.println(list.size());

        System.out.println("------- ACHAR POSIÇÃO ---------");

        System.out.println(list.indexOf("Joana"));
        System.out.println(list.indexOf("Bob"));

        System.out.println("------- FILTRAR LISTA ---------");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'J').collect(Collectors.toList());

        for(String x: result){
            System.out.println(x);
        }

        System.out.println("------- FILTRAR LISTA 1 ELEMENTO---------");

        String name = list.stream().filter(x -> x.charAt(0) == 'T').findFirst().orElse(null);

        System.out.println(name);

    }
}
