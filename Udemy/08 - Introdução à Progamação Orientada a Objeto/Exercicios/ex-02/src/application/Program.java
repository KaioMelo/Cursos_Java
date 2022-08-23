package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Employee employee = new Employee();
        System.out.print("Name: ");
        employee.name = scan.nextLine();
        System.out.print("Gross salary: ");
        employee.grossSalary = scan.nextDouble();
        System.out.print("Tax: ");
        employee.tax = scan.nextDouble();

        System.out.println();
        System.out.print("Employee: " + employee);

        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        double percentage = scan.nextDouble();
        employee.IncreaseSalary(percentage);

        System.out.println();
        System.out.print("Update data: " + employee);
        scan.close();
    }
}
