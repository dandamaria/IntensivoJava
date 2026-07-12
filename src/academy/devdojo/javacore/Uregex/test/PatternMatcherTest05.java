package academy.devdojo.javacore.Uregex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    public static void main(String[] args) {
        // \d = Todos os dígitos (números)
        // \D = Tudo que não for dígito
        // Todos os espaços em branco \t \n \r
        // \S = Todos os caracteres excluindo espaços em branco
        // \w = Tudo que a-z e A-Z, dígitos e _
        // \W = Tudo que não for incluso no \w
        // [] = Range de caracteres

        //quantificadores
        //? Zero ou uma ocorrência
        //* Zero ou mais
        //+ Uma ou mais
        //{n,m} de n até m
        //() agrupamento
        // | ou
        // exemplo: o(v|c)o = ovo, oco
        // $ Fim da linha

        //emails válidos:
        //começo: apenas letras, números, ponto, underline, hífen - Precisa se repetir uma ou mais vezes
        //meio: @gmail ou @hotmail - Precisa aparecer uma única vez
        //final: .com - Precisa aparecer uma única vez também

        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)*";
        String texto = "luffy@hotmail.com,  123jotaro@gmail.com.br, #@!zoro@gmail.br, test@gmail.com, sakura@email";

        System.out.println(Arrays.toString(texto.split(",")));
        System.out.println(texto.split(",")[1].trim());

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("texto:  "+ texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex: "+regex);
        System.out.println("posições encontradas");
        while (matcher.find()){
            System.out.println(matcher.start()+" "+matcher.group());
        }

    }
}
