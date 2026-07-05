package academy.devdojo.javacore.Rdates.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest {
    public static void main(String[] args) {
        LocalDateTime bithday = LocalDateTime.of(2007, Month.DECEMBER, 20, 14, 0, 0);
        LocalDateTime now = LocalDateTime.now();

        System.out.println(ChronoUnit.DAYS.between(bithday, now));
        System.out.println(ChronoUnit.WEEKS.between(bithday, now));
        System.out.println(ChronoUnit.YEARS.between(bithday,now));
    }
}
