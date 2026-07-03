package academy.devdojo.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        NumberFormat[] nfa = new NumberFormat[4];
        Locale locale = new Locale("pt", "BR");
        Locale locale1 = Locale.JAPAN;
        Locale locale2 = Locale.ITALY;
        Locale localeDefault = Locale.getDefault();

        nfa[0] = NumberFormat.getCurrencyInstance();
        nfa[1] = NumberFormat.getCurrencyInstance(locale);
        nfa[2] = NumberFormat.getCurrencyInstance(locale1);
        nfa[3] = NumberFormat.getCurrencyInstance(locale2);

        double valor = 10_0000.2130;

        for(NumberFormat nf : nfa){
            System.out.println(nf.getMaximumFractionDigits());
            nf.setMaximumFractionDigits(2);
            System.out.println(nf.format(valor));
        }

        String valorString = "￥100,000.21";
        try {
            System.out.println(nfa[0].parse(valorString));
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}
