package application;

import entities.TaxPayer;
import entities.legalPerson;
import entities.physicalPerson;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            System.out.println("TaxPayer payer #"+ (i+1) +" data:");
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            Double anualIncome = sc.nextDouble();

            if (ch == 'i'){
               System.out.print("Health expenditures: ");
               Double health = sc.nextDouble();
               list.add(new physicalPerson(name, anualIncome, health));
            }else{
                System.out.print("Number of employees: ");
                Integer numberEmployee = sc.nextInt();
                list.add(new legalPerson(name, anualIncome, numberEmployee));
            }
        }
        double sum = 0;
        System.out.println();
        System.out.println("TAXES PAID:");
        for (TaxPayer tp : list) {
            double tax = tp.tax();
            System.out.println(tp.getName() + ": $" + String.format("%.2f", tax));
            sum += tax;
        }
        System.out.println();
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
        sc.close();
    }
}
