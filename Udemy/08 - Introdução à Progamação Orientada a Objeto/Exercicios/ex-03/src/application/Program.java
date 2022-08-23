package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Nome do aluno: ");
        student.name = scan.nextLine();
        System.out.print("Digite notas do Primeiro, Segundo e Tercerio Semestre: ");
        student.not1 = scan.nextDouble();
        student.not2 = scan.nextDouble();
        student.not3 = scan.nextDouble();

        System.out.printf("FINAL GRADE = %.2f%n", student.SemestreFinal());

        if (student.SemestreFinal() < 60.0) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", student.MediaFinal());
        }
        else {
            System.out.println("PASS");
        }
        scan.close();
    }
}
