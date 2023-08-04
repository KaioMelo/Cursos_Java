package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        // Instanciando

        //List<Object> myObjs = new ArrayList<Object>(); Lista de Object não é outras listas

        List<?> myObjs = new ArrayList<Object>();
        List<Integer> myNumbers = new ArrayList<Integer>();
        myObjs = myNumbers;

        // Passando por metodo

        List<Integer> myInt = Arrays.asList(5, 2, 10);
        List<String> myString = Arrays.asList("Joana", "Kaio", "Hariel");
        printList(myInt);
        printList(myString);
    }

    public static void printList(List<?> list){
        // list.add(3) Não é possivel adicionar em uma lista Curinga
        for(Object obj: list){
            System.out.println(obj);
        }
    }
}
