package academy.devdojo.intro.Exercios;

import java.util.Scanner;

public class NumeroPrimoOuNao {
    public static void main(String[] args) {
        /*minha ideia com esse exercício é fazer um algoritmo que dado a entrada de um número k
        ele verifique se esse número é primo ou não;
         */
        System.out.println("digite um número");
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();

        //se esse número for divisível pro qualquer outro número menor do que ele, quer dizer que
        //ele não é primo, mas se não for por nenhum além dele mesmo, então é.
        //1.verificar todos os números antes dele

        for (int i = 2; i < k; i++) {
            if(k%i == 0){
                System.out.println("não é primo");
                break;
            }else{
                System.out.println("É primo");
                break;
            }
        }
    }
}
