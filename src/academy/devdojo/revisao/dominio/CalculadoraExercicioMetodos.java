package academy.devdojo.revisao.dominio;

import java.util.Scanner;

public class CalculadoraExercicioMetodos {

    public float calculadora(String resp, float a){
        switch (resp){
            case "+":
                return soma(a);
            case "-":
                return subtrai(a);
            case "/":
                return divide(a);
            case "*":
                return mutiplica(a);
            default:
                System.out.println("inválido");
                break;
        }
        return a;
    }

    Scanner input = new Scanner(System.in);

    public float soma(float a){
        float b = input.nextFloat();
        return a+b;
    }

    public int soma(int a){
        return (int)soma((float)a);
    }


    public float subtrai(float a){
        float b = input.nextFloat();
        return a-b;
    }

    public int subtrai(int a){
        return (int)subtrai((float) a);
    }

    public float divide(float a){
        float b = input.nextFloat();
        return a/b;
    }

    public float mutiplica(float a){
        float b = input.nextFloat();
        return a*b;
    }
}
