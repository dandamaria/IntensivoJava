package academy.devdojo.revisao;

import academy.devdojo.javacore.Uregex.test.PatternMatcherTest04;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EntendendoRegex {
    //Site pra treinar: https://regexr.com/
    //Onde ver os regex: passa o cursor do mouse sobre "compile" depois clica em java.util.regex.Pattern

    public static void main(String[] args) {
        String cpf = "123.324.567-02";
        String log= "Usuário entrou\n" +
                "\n" +
                "ERROR 404\n" +
                "\n" +
                "Conexão perdida\n" +
                "\n" +
                "ERROR 500";
        String regex = "\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}";
        String regex2 = "(?<=ERROR).+";

        //MÉTODOS IMPORTANTES

        // 1 - matches(). "O texto inteiro segue esse padrão?" retorna true ou false
        Boolean resposta = cpf.matches(regex);
        //serve pra validar

        // 2 - find(). "Existe alguma parte do texto que bate com essa regex?"
        Pattern pattern = Pattern.compile(regex2); //Pattern - retorna a expressão regular fornecida compilada em um padrão
        Matcher matcher = pattern.matcher(log); //Matcher
        Matcher matcher1 = Pattern.compile(regex2).matcher(log);
        while(matcher.find()){
            //para pegar o que o find encontrou: matcher.group()
            System.out.println(matcher.group());
        }

        // 3 - matcher.group()
        String texto = "15/09/2004";
        String regex3 = "(\\d{2})/(\\d{2})/(\\d{4})";
        Pattern pattern1 = Pattern.compile(regex3);
        Matcher matcher2 = pattern1.matcher(texto);
        System.out.println("------");
        while (matcher2.find()){
            System.out.println(matcher2.group());
            System.out.println(matcher2.group(2));
            System.out.println(matcher2.group(1));
        }

        //4 - replaceAll()
        //Muito útil pra limpeza de dados, exemplo: limpar cpf
        String regex4 = ".-";
        String regex5 = "\\.";
        cpf = cpf.replaceAll(regex4,"");
        cpf = cpf.replaceAll(regex5,"");
        System.out.println(cpf);

        

    }


}
