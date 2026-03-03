package academy.devdojo.javacore.Npolimorfismo.test;

import academy.devdojo.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.javacore.Npolimorfismo.dominio.Televisao;
import academy.devdojo.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest {
    public static void main(String[] args) {
        Computador computador = new Computador("Nuc-10i7", 10300);
        Tomate tomate = new Tomate("vermelho",30);
        Televisao tv = new Televisao("Samsung 50\"", 5000);
        tomate.setDataValidade("23/04/2012");

        /*CalculadoraImposto.CalculadorImpostoComputador(computador);
        System.out.println("----------------");
        CalculadoraImposto.CalculadorImpostoTomate(tomate);
        */

        CalculadoraImposto.CalcularImposto(computador);
        System.out.println("-----------------------");
        CalculadoraImposto.CalcularImposto(tomate);
        System.out.println("-----------------------");
        CalculadoraImposto.CalcularImposto(tv);
    }
}
