package academy.devdojo.javacore.Rdates.test;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(01, 32, 12);
        System.out.println(time);
        System.out.println(LocalTime.now());
        System.out.println(time.get(ChronoField.HOUR_OF_DAY));
        System.out.println(LocalTime.MIN); //hora mínimo do dia
        System.out.println(LocalTime.MIDNIGHT); //meia noite - mesma coisa do min
        System.out.println(LocalTime.MAX);
    }
}
