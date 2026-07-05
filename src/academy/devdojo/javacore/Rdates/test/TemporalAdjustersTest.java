package academy.devdojo.javacore.Rdates.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

        now = now.withDayOfMonth(20);
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
        now = now.plusDays(14);
        System.out.println(now);

        System.out.println("-----------now-----------");
        now = LocalDate.now();
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
        now = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());


    }
}
