package academy.devdojo.javacore.CsobrecargaMetodos.test;

import academy.devdojo.javacore.CsobrecargaMetodos.dominio.CalculadoraExercicio;

public class ExerciciosTest {
    public static void main(String[] args) {
        CalculadoraExercicio calculator = new CalculadoraExercicio();

        calculator.soma(3,4);
        int soma = calculator.soma(1,2,3);
        calculator.soma(8.9,7.3);

        System.out.println(soma);
    }
}
