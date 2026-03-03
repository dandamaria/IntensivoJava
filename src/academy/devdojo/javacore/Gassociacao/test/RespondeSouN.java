package academy.devdojo.javacore.Gassociacao.test;

import java.util.Scanner;

public class RespondeSouN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true) {

            System.out.println("Digite uma pergunta de sim ou não e eu responderei! ");
            String pergunta = input.nextLine().trim();

            int indexLastWorld = pergunta.lastIndexOf(" ");

            String lastWord = pergunta.substring(indexLastWorld + 1);
            int size = lastWord.length();

            if (size > 7) {
                System.out.println("SIM");
            } else {
                System.out.println("NÃO");
            }
        }

    }
}
