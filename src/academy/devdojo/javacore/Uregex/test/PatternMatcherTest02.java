package academy.devdojo.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // \d = Todos os dígitos (números)
        // \D = Tudo que não for dígito
        // Todos os espaços em branco \t \n \r
        // \S = Todos os caracteres excluindo espaços em branco
        // \w = Tudo que a-z e A-Z, dígitos e _
        // \W = Tudo que não for incluso no \w

        String regex = "\\W";
        String texto = "abaaba";
        String texto2 = "@k_ajh34ka d9\t2hjd92hs 9a";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);

        System.out.println("texto:  "+ texto2);
        System.out.println("indice: 0123456789");
        System.out.println("regex: "+regex);
        System.out.println("posições encontradas");
        while (matcher.find()){
            System.out.println(matcher.start()+" "+matcher.group());
        }

    }
}
