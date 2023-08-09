package application;

import entities.Student;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Student> set = new HashSet<>();

        try{
            System.out.println("How many students  for course A: ");
            int n = sc.nextInt();
            for(int i = 0; i < n; i++){
                int number = sc.nextInt();
                set.add(new Student(number));
            }
            System.out.println("How many students  for course B: ");
            n = sc.nextInt();
            for(int i = 0; i < n; i++){
                int number = sc.nextInt();
                set.add(new Student(number));
            }
            System.out.println("How many students  for course C: ");
            n = sc.nextInt();
            for(int i = 0; i < n; i++){
                int number = sc.nextInt();
                set.add(new Student(number));
            }
            System.out.println("Total students: " + set.size());
        }
        catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
