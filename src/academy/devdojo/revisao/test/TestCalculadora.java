package academy.devdojo.revisao.test;

import academy.devdojo.revisao.dominio.CalculadoraExercicioMetodos;

import java.util.Scanner;

public class TestCalculadora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CalculadoraExercicioMetodos calculadora = new CalculadoraExercicioMetodos();

        boolean sair = false;
        System.out.println("Calculadora! Digite os números e sinais um de cada vez e para ver o resultado digite '='");

        float atual = 0;
        float valor = 0;

        String resp = input.nextLine();

        if(resp.equals("=")){
            System.out.println(atual);
            sair = true;
        } else {
            valor = Float.valueOf(resp);
            atual = valor;
        }

        while(!sair){
            resp = input.nextLine();

            if(resp.equals("=")){
                System.out.println(atual);
                sair = true;
            } else {
                atual = calculadora.calculadora(resp, atual);
            }

        }
    }
}
