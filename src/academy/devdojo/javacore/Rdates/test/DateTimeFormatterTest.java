package academy.devdojo.javacore.Rdates.test;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        String s0 =date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s1 = date.format(DateTimeFormatter.ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(s0);
        System.out.println(s1);
        System.out.println(s2);

        LocalDate ps1 = LocalDate.parse("20260704", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate ps2 = LocalDate.parse("2026-07-04+05:00", DateTimeFormatter.ISO_DATE);
        System.out.println("parse 1: "+ps1);
        System.out.println("parse 2: "+ps2);

        LocalDateTime now = LocalDateTime.now();
        String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s4);
        LocalDateTime ps3 = LocalDateTime.parse("2026-07-04T23:49:27.2162583", DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(ps3);

        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBR = LocalDate.now().format(formatterBR);
        System.out.println(formatBR);
        LocalDate parseBr = LocalDate.parse("19/02/2026", formatterBR);
        System.out.println(parseBr);

        DateTimeFormatter formatterGR = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMAN);
        String formatGR = LocalDate.now().format(formatterGR);
        System.out.println(formatGR);
        LocalDate parseGR = LocalDate.parse("19.Februar.2026", formatterGR);
        System.out.println(parseGR);

    }
}
