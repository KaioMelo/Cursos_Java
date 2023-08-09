package application;

import entities.Product;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {

        // DEMO 1
        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "99711112");

        cookies.remove("email");
        cookies.put("phone", "99244555");

        System.out.println("Contains 'phone' key: "+ cookies.containsKey("phone"));
        System.out.println("Phone number: "+ cookies.get("phone"));
        System.out.println("Email: "+ cookies.get("email"));

        System.out.println("ALL COOKIES: ");
        for(String key: cookies.keySet()){
            System.out.println(key + ": "+ cookies.get(key));
        }

        // DEMO 2

        Map<Product, Double> stock = new HashMap<>();

        Product p1 = new Product("TV", 900.00);
        Product p2 = new Product("Notebook", 1200.00);
        Product p3 = new Product("Tablet", 400.00);

        stock.put(p1, 1000.0);
        stock.put(p2, 2000.0);
        stock.put(p3, 3000.0);

        Product ps = new Product("TV", 900.00);

        System.out.println("Contains 'ps' key: "+ stock.containsKey(ps));
    }
}
