package application;

import java.util.*;

public class Program {
    public static void main(String[] args) {

        Set<String> sethash = new HashSet<>();
        Set<String> setTree = new TreeSet<>();
        Set<String> setLinked = new LinkedHashSet<>();

        sethash.add("TV");
        sethash.add("Notebook");
        sethash.add("Tablet");

        //System.out.println(sethash.contains("Notebook"));

        sethash.remove("TV");
        sethash.removeIf(x -> x.length() <=  3);

        for(String p: sethash){
            System.out.println(p);
        }


        Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));

        //Union
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);

        //Intersection
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);

        //Difference
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println(e);

    }
}
