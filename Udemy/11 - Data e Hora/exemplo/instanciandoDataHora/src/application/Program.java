package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {


        DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatterDateTime = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate currentDate = LocalDate.now();
        LocalDateTime currentTime = LocalDateTime.now();
        Instant currentTimeGlobal = Instant.now();

        LocalDate currentDateString = LocalDate.parse("2023-07-03");
        LocalDateTime currentTimeString = LocalDateTime.parse("2023-07-03T18:47:26");
        Instant currentTimeGlobalString = Instant.parse("2023-07-03T18:47:26Z");
        //Instant currentTimeGlobalStringSP = Instant.parse("2023-07-03T18:47:26-03:00");

        LocalDate formatterDateBR = LocalDate.parse("03/07/2023", formatterDate);
        LocalDate formatterDateTimeBR = LocalDate.parse("03/07/2023 01:46", formatterDateTime);

        LocalDate date = LocalDate.of(2023, 7, 03);
        LocalDateTime dateTime = LocalDateTime.of(2023, 7, 03, 19, 52);



        System.out.println("Data Atual - "+ currentDate);
        System.out.println("Tempo Atual - " + currentTime);
        System.out.println("Tempo Atual Global (timezone) - "+ currentTimeGlobal);

        System.out.println("Data Atual passado por String - "+ currentDateString);
        System.out.println("Tempo Atual passado por String - "+ currentTimeString);
        System.out.println("Tempo Atual Global (timezone) passado por String - "+ currentTimeGlobalString);
        //System.out.println("Tempo Atual Global (timezone) passado por String MTB SP-3- "+ currentTimeGlobalStringSP);

        System.out.println("Data Atual, formato Brasil - "+ formatterDateBR);
        System.out.println("Data e Hora Atual, formato Brasil - "+ formatterDateTimeBR);

        System.out.println("Date formato simples - "+ date);
        System.out.println("Date e Time  formato simples - "+ dateTime);
    }
}
