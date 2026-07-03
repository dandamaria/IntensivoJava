package academy.devdojo.javacore.Sformatacao.test;

import academy.devdojo.javacore.Gassociacao.exercicioSeminario.Local;

import java.util.Locale;

public class LocaleTest02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        String[] isoLanguages = Locale.getISOLanguages();
        String[] isoCountries = Locale.getISOCountries();

        for(String isoLanguage : isoLanguages){
            System.out.print(" "+isoLanguage);
        }
        System.out.println("\n");

        for(String isoCountrie : isoCountries){
            System.out.print(" "+isoCountrie);
        }
    }
}
