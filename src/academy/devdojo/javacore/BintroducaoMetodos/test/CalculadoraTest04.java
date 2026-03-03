package academy.devdojo.javacore.BintroducaoMetodos.test;

import academy.devdojo.javacore.BintroducaoMetodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String... args) {
        Calculadora calculadora = new Calculadora();
        int[] numsDanda = {1,2,10,20};
        calculadora.somaArray(numsDanda);
        calculadora.somaArray(new int[]{1,2,3,4,5});

        calculadora.somaVarArgs(1,10,20);
    }
}
