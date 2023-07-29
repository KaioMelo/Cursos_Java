package application;

import model.entities.Contract;
import model.entities.Installment;
import model.service.ContractService;
import model.service.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try{
            System.out.println("Entre os dados do contrato:");
            System.out.print("Numero:");
            Integer number = sc.nextInt();
            System.out.print("Data (dd/MM/yyyy): ");
            LocalDate date = LocalDate.parse(sc.next(), fmt);
            System.out.print("Valor do contrato: ");
            Double totalValue = sc.nextDouble();
            Contract obj = new Contract(number, date, totalValue);

            System.out.print("Entre com o numero de parcelas: ");
            Integer n = sc.nextInt();

            ContractService service = new ContractService(new PaypalService());

            service.processContract(obj, n);

            System.out.println("Parcelas: ");

            for(Installment installment: obj.getInstallment()){
                System.out.println(installment);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
