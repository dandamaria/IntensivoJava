package academy.devdojo.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYers = now.plusYears(2).plusDays(7);
        Period p1 = Period.between(now, nowAfterTwoYers);
        System.out.println(p1);
        System.out.println(Period.ofDays(10));
        System.out.println(Period.ofWeeks(58));
        System.out.println(Period.ofMonths(4));

        Period p3 = Period.ofWeeks(60);

    }
}
