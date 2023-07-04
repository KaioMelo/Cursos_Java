package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {

        LocalDate currentDateString = LocalDate.parse("2023-07-03");
        LocalDateTime currentTimeString = LocalDateTime.parse("2023-07-03T18:47:26");
        Instant currentTimeGlobalString = Instant.parse("2023-07-03T18:47:26Z");


        // https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
        DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatterDateTime = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter formatterDateTimeZone = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        System.out.println("Current Date - " + currentDateString.format( formatterDate));
        System.out.println("Current Date - " +  formatterDate.format(currentDateString));
        System.out.println("Current Date - " + currentDateString.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println("Current Date e Time - " + currentTimeString.format(formatterDate));
        System.out.println("Current Date e Time- " + currentTimeString.format(formatterDateTime));

        System.out.println("Current Date e Time Global - " +  formatterDateTimeZone.format(currentTimeGlobalString));
    }
}
