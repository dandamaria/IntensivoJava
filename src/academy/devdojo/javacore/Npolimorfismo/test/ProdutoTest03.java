package academy.devdojo.javacore.Npolimorfismo.test;

import academy.devdojo.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9",3000);
        Produto produto2 = new Tomate("Brasileiro",10);
        Tomate tomate = new Tomate("Banban", 20);
        tomate.setDataValidade("02/03");
        System.out.println(tomate.getDataValidade());
        CalculadoraImposto.CalcularImposto(tomate);

    }
}
