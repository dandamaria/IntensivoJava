package academy.devdojo.javacore.Sformatacao.test;

import academy.devdojo.javacore.Gassociacao.exercicioSeminario.Local;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest {
    public static void main(String[] args) {
        NumberFormat[] nfa = new NumberFormat[4];
        Locale locale = new Locale("pt", "BR");
        Locale locale1 = Locale.JAPAN;
        Locale locale2 = Locale.ITALY;
        Locale localeDefault = Locale.getDefault();

        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(locale);
        nfa[2] = NumberFormat.getInstance(locale1);
        nfa[3] = NumberFormat.getInstance(locale2);

        double valor = 10_0000.2130;

        for(NumberFormat nf : nfa){
            System.out.println(nf.getMaximumFractionDigits());
            System.out.println(nf.format(valor));
        }
    }
}
