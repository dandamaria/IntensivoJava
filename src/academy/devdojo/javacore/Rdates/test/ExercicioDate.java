package academy.devdojo.javacore.Rdates.test;

import academy.devdojo.javacore.Gassociacao.exercicioSeminario.Local;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

//qualquer dia retorna o próximo dia util exceto sexta, sábado ou domingo.

public class ExercicioDate {

    public static LocalDate nextUtilDayOfWeek(LocalDate localDate){
        DayOfWeek[]not = {DayOfWeek.THURSDAY,DayOfWeek.FRIDAY, DayOfWeek.SATURDAY, DayOfWeek.SUNDAY};
        DayOfWeek nextDay = localDate.getDayOfWeek().plus(1);
        for(DayOfWeek day : not){
            if(localDate.getDayOfWeek().equals(day)){
                nextDay = DayOfWeek.MONDAY;
            }
        }
        return localDate.with(TemporalAdjusters.next(nextDay));
    }

    public static void main(String[] args) {
        //teste 1
        LocalDate d = LocalDate.now();
        System.out.println(d);
        System.out.println(d.getDayOfWeek());

        //teste 2
        d = nextUtilDayOfWeek(d);
        System.out.println(d);
        System.out.println(d.getDayOfWeek());

        //teste 3
        d = d.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
        System.out.println(nextUtilDayOfWeek(d));
        System.out.println(nextUtilDayOfWeek(d).getDayOfWeek());

    }
}


