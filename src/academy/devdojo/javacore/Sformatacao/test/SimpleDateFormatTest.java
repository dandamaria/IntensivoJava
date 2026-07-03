package academy.devdojo.javacore.Sformatacao.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {
    public static void main(String[] args) {

        //Trabalhar com a formatação de datas de forma flexível - utilizando os padrões definidos de Letras
        //Essas Letras estão na documentação
        //Exemplo: "yy.MM.dd"

        String pattern = "yyyy.MM.dd G 'at' HH:mm:ss z";

        SimpleDateFormat sfd = new SimpleDateFormat();
        System.out.println(sfd.format(new Date()));

        SimpleDateFormat sdf = new SimpleDateFormat(pattern); //imprime horário atual naquele formato
        System.out.println(sdf.format(new Date()));

        String pattern2 = "'Amsterdan' dd ' de' MMMMM 'de' yyyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern2);
        System.out.println(simpleDateFormat.format(new Date()));

        try {
            System.out.println(sdf.parse("Amsterdan 15 de February de 2021"));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
