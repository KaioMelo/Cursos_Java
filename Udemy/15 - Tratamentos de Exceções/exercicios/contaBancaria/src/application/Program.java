package application;

import model.entities.Account;
import model.exception.DomainException;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account account;

        try{
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            System.out.print("Holder: ");
            sc.nextLine();
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();
            account = new Account(number, holder, balance, withdrawLimit);

            System.out.println();
            System.out.println("Enter amount for withdraw:");
            double amount = sc.nextDouble();
            account.withdraw(amount);

            System.out.println(account);
        }
        catch (InputMismatchException e){
            System.out.println("Error input!");
        }
        catch (DomainException e){
            System.out.println("Withdraw error: " + e.getMessage());
        }

        sc.close();
    }
}
