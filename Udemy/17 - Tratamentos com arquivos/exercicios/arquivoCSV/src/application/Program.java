package application;

import entities.Product;

import java.io.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        //"C:\\test\\in.csv"
        System.out.println("Enter file path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        String sourceFolder = path.getParent();
        boolean success = new File(sourceFolder + "\\out").mkdir();
        String targetFile = sourceFolder + "\\out\\summary.csv";

        try(BufferedReader br = new BufferedReader(new FileReader(strPath))){
            String lineCsv = br.readLine();
            while(lineCsv != null){
                String[] fields = lineCsv.split(",");
                String name = fields[0];
                Double price = Double.parseDouble(fields[1]);
                Integer quantity = Integer.parseInt(fields[2]);

                list.add(new Product(name, price, quantity));

                lineCsv = br.readLine();
            }
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetFile))){
                for(Product item: list){
                    bw.write(item.getName() + ", " + String.format("%.2f", item.total()));
                    bw.newLine();
                }
                System.out.println(targetFile + "  CREATED!");
            }
            catch (IOException e){
                System.out.println("Error writing file: "+ e.getMessage());
            }
        }
        catch (IOException e){
            System.out.println("Error reading file: " + e.getMessage());
        }

        sc.close();
    }
}
