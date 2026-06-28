package academy.devdojo.revisao.RevisaoExceptions;

import java.util.Scanner;

public class Exception01 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("digite: ");

        // aqui o programa tenta, dá errado e não continua
//        String number = leitor.nextLine();
//
//        int num = Integer.parseInt(number);
//        System.out.println("número: " + number);

        String number = leitor.nextLine();
        try{
           int num = Integer.parseInt(number);
            System.out.println("número: "+num);
        }catch (NumberFormatException e){
            e.getMessage();
            e.printStackTrace();
            System.out.println(number+" não é um número válido");
        }
        System.out.println("o programa tentou e depois continuou"); //aqui funciona

    }
}
