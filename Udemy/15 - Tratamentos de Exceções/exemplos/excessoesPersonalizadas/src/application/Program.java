package application;

import model.entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Room number: ");
        int number = sc.nextInt();
        System.out.println("Check-in date (dd/MM/yyyy): ");
        Date checkIn = sdf.parse(sc.next());
        System.out.println("Check-out date (dd/MM/yyyy): ");
        Date checkOut = sdf.parse(sc.next());

        if(!checkOut.after(checkIn)){ // "after" verifica se check-out está depois de check-in
            System.out.println("Error in reservation: check-out date must be after check-in date");
        }else{
            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation: "+ reservation);

            System.out.println();
            System.out.println("Room number: ");
            number = sc.nextInt();
            System.out.println("Check-in date (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.println("Check-out date (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());

            Date now = new Date();
            if(checkIn.before(now) || checkOut.before(now)){
                System.out.println("Error in reservation dates for updates must be future ");
            }else if(!checkOut.after(checkIn)){
                System.out.println("Error in reservation: check-out date must be after check-in date");
            }else{
                reservation.updateDates(checkIn, checkOut);
                System.out.println("Reservation: "+ reservation);
            }
        }

        sc.close();
    }
}
