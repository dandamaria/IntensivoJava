package academy.devdojo.javacore.Gassociacao.test;

import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu sexo");
        char sexo = entrada.next().charAt(0);

        System.out.println("sexo " + sexo);

        entrada.nextLine();
        System.out.println("digite seu nome ");
        String nome = entrada.nextLine();

        int pos = nome.length();
        char ultima = nome.charAt(pos-1);
        System.out.println("a ultima letra do nome é "+ultima);
    }
}
