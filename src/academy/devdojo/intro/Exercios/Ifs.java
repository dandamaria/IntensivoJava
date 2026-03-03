package academy.devdojo.intro.Exercios;

import java.util.Scanner;

public class Ifs {
    public static void main(String[] args) {
        //dado um determinado salário anual em euros, determine quanto de impostos devem ser pagos

        System.out.println("Digite seu salário bruto para calcular seu salário líquido");
        Scanner scanner = new Scanner(System.in);
        double salario = scanner.nextDouble();
        double salarioliquido=0;
        double imposto=0;

        if(salario >= 0 && salario <= 34712) {
            imposto = 0.0970;
        salarioliquido = salario - (salario * imposto);
        }else if (salario > 34712 && salario <= 68507) {
            imposto = 0.3735;
            salarioliquido = salario - (salario * imposto);
        } else if (salario>68507){
            imposto = 0.4950;
            salarioliquido = salario - (salario * imposto);
        }

        System.out.println("Você deve pagar " + imposto + " de impostos, resultando em um salário líquido de " + salarioliquido + "€");
    }
}
