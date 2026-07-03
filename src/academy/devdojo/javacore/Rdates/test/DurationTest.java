package academy.devdojo.javacore.Rdates.test;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTest {
    public static void main(String[] args) {
        //para trabalhar com intervalos entre datas - em segundos e nanosegundos
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYers = now.plusYears(2);
        LocalTime nowTime = LocalTime.now();
        LocalTime timeMinus7Hours = LocalTime.now().minusHours(7);

        Duration duration = Duration.between(now, nowAfterTwoYers);
        Duration duration1 = Duration.between(nowTime,timeMinus7Hours);

        System.out.println(duration);
        System.out.println(duration1);

        //Duration não aceita a classe LocalDate, exemplo:
        //Duration.between(LocalDate.now(), LocalDate.of(2029, 4, 5));

        Duration duration2 = Duration.ofHours(1);
        Duration duration3 = Duration.ofMinutes(3);
        System.out.println(duration2);
        System.out.println(duration3);
    }
}
