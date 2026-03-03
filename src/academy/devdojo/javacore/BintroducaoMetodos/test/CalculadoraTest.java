package academy.devdojo.javacore.BintroducaoMetodos.test;

import academy.devdojo.javacore.BintroducaoMetodos.dominio.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros(); //aqui tem os parênteses
        calculadora.subtraiDoisNumeros(); //ativando outro método
        System.out.println("---------");
        calculadora.multiplicaDoisNumeros(7,8);
        System.out.println("---------");
        calculadora.outrosExemplos(2,6.7F,true);
        System.out.println("---------");
        //como ele retorna um tipo, precisa ser escrito assim
        double resultado = calculadora.divideDoisNumeros(20,2);
        System.out.println(resultado);
        System.out.println("ou"+ calculadora.divideDoisNumeros(10,5));
        //cast
        int numero = (int)calculadora.divideDoisNumeros(30,15);
        System.out.println(numero);


    }
}
