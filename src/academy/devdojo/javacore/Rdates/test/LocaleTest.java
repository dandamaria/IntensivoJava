package academy.devdojo.javacore.Rdates.test;

import academy.devdojo.javacore.Gassociacao.exercicioSeminario.Local;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest {
    public static void main(String[] args) {
        // ISO's: português - pt, Brasil - BR
        Locale localeItaly = new Locale("it", "it");
        Locale localeItalyCH = new Locale("it", "CH");
        Locale localeBrasil = new Locale("pt", "BR");
        Locale localeJapao = new Locale("ja", "JP");
        Locale localePortunes = new Locale("pt", "JP");

        Calendar calendar = Calendar.getInstance(); //pega a data/horário atual

        DateFormat f1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat f2 = DateFormat.getDateInstance(DateFormat.FULL, localeItalyCH);
        DateFormat beerre = DateFormat.getDateInstance(DateFormat.FULL, localeBrasil);
        DateFormat f3 = DateFormat.getDateInstance(DateFormat.FULL, localeJapao);
        DateFormat f4 = DateFormat.getDateInstance(DateFormat.FULL, localePortunes);

        System.out.println("Brasil "+beerre.format(calendar.getTime()));
        System.out.println("Japão: "+f3.format(calendar.getTime()));
        System.out.println("Japão: "+f4.format(calendar.getTime()));

        System.out.println("Data na Itália na Itália: "+f1.format(calendar.getTime()));
        System.out.println("Data na Itália na Suíca: "+f2.format(calendar.getTime()));
    }
}
