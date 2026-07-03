package academy.devdojo.javacore.Rdates.test;

import academy.devdojo.javacore.Gassociacao.exercicioSeminario.Local;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDate localDate = LocalDate.of(2020, Month.APRIL, 30);
        LocalTime localTime = LocalTime.of(9, 45, 21);

        LocalDate date = LocalDate.parse("2022-08-04");
        LocalTime time = LocalTime.parse("09:45:00");

        System.out.println(date);
        System.out.println(time);

        LocalDateTime localDateTime1 = date.atTime(time);
        System.out.println(localDateTime1);

        LocalDateTime localDateTime2 = time.atDate(date);
        System.out.println(localDateTime2);



    }
}
