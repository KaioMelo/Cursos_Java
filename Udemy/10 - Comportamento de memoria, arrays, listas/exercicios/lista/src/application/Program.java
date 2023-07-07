package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();
        System.out.println();
        List<Employee> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("Emplyoee #" + (i + 1)+ ":");
            System.out.print("ID: ");
            Integer id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();
            list.add(new Employee(id, name, salary));
            System.out.println();
        }

        System.out.print("Enter the employee id that will have salary increase : ");
        int idList = sc.nextInt();
        Integer pos = position(list, idList);

        if (pos != null){
            System.out.println();
            System.out.print("Enter the percentage: ");
            double percent = sc.nextDouble();
            list.get(pos).increaseSalary(percent);
        }else{
            System.out.println("This id does not exist!");
        }

        System.out.println();
        System.out.println("List of employees:");
        for (Employee emp: list) {
            System.out.print(emp);
        }

        sc.close();;
    }
    //Função responsavel por trazer a posição do ID do usuário
    public static Integer position(List<Employee> list, int id ){
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).getId() == id) {
                return 1;
            }
        }
        return null;
    }
}
