package academy.devdojo.javacore.Rdates.test;

import academy.devdojo.javacore.Gassociacao.exercicioSeminario.Local;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;


public class LocalDateTest01 {
    public static void main(String[] args) {
        //antigos
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());

        //novos (Criado no JAVA 8)
        System.out.println(Month.JANUARY.getValue());
        LocalDate birthday = LocalDate.of(2026, Month.DECEMBER, 20);
        System.out.println(birthday);
        System.out.println(birthday.getMonth());
        LocalDate date = LocalDate.of(LocalDate.now().getYear(), LocalDate.now().getMonth(), LocalDate.now().getDayOfMonth());
        LocalDate agora = LocalDate.now(); //Só isso

        System.out.println(date.getDayOfWeek());
        System.out.println(date.getMonthValue());
        System.out.println(date.lengthOfMonth());
        System.out.println("é um ano bissexto: "+date.isLeapYear());
        //coisas mais específicas pode usar a ChronoField
        System.out.println(date.get(ChronoField.YEAR_OF_ERA));
        System.out.println(date.get(ChronoField.DAY_OF_YEAR));

        System.out.println(agora);
        System.out.println(LocalDate.MAX);
        System.out.println(LocalDate.MIN);

        agora.plusMonths(1); //o resultado é ignorado porque é uma classe imutável
        agora = agora.plusYears(1); //agora funciona
        System.out.println(agora);
    }
}
