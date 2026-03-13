package day5.basic;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class WorkingWithDateAndTime {
    public static void main(String[] args) {
        LocalDate date=LocalDate.now();
        System.out.println("Date "+date);
        LocalTime time=LocalTime.now();
        System.out.println("Time "+time);
        LocalDateTime datetime=LocalDateTime.now();
        // Display the day of the month
        // Display the day of the year
        //Display the week Name, Month Name , Month Number

        /*
        E name of the day
        D Day of the year
        dd Day of the month
        M Month number
        MMM Month name Jan - Dec

         */
        DateTimeFormatter format=DateTimeFormatter.ofPattern("d m y E");
        String formattedDateTime=datetime.format(format);
        System.out.println(formattedDateTime);
    }
}
