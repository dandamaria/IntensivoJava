package academy.devdojo.javacore.BintroducaoMetodos.test;

import academy.devdojo.javacore.BintroducaoMetodos.dominio.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        int num1 = 1;
        int num2 = 2;
        calculadora.alteraDoisNumeros(num1, num2);
        System.out.println("-------");
        System.out.println("fora do método: ");
        System.out.println("números 1 e 2: "+num1+" "+num2);
        //ou seja, a variável original não é alterada mesmo que um método seja chamado e envolva ela;
        
    }
}
