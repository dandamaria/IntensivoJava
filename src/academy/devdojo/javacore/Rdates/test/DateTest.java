package academy.devdojo.javacore.Rdates.test;

import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        Date date = new Date(); //ninguém mais utiliza isso // long 100000
        Date hoje = new Date();
        hoje.setTime(date.getTime());

        System.out.println(date);
        System.out.println(date.getTime());

        System.out.println(hoje);
    }
}
