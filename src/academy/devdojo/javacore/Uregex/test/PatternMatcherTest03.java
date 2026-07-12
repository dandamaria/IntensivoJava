package academy.devdojo.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        // \d = Todos os dígitos (números)
        // \D = Tudo que não for dígito
        // Todos os espaços em branco \t \n \r
        // \S = Todos os caracteres excluindo espaços em branco
        // \w = Tudo que a-z e A-Z, dígitos e _
        // \W = Tudo que não for incluso no \w
        // [] = Range de caracteres

//        String regex = "[a-z, A-C]";
        String regex = "0[xX][0-9,af,AF]";
        String texto2 = "12 0x 0X 0xFFABC 0x109 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);

        System.out.println("texto:  "+ texto2);
        System.out.println("indice: 0123456789");
        System.out.println("regex: "+regex);
        System.out.println("posições encontradas");
        while (matcher.find()){
            System.out.println(matcher.start()+" "+matcher.group());
        }
        int numeroHex = 0x59F86A;
        System.out.println(numeroHex);

    }
}
