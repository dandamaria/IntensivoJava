package academy.devdojo.javacore.Npolimorfismo.test;

import academy.devdojo.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.javacore.Npolimorfismo.dominio.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9",3000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        double imposto = produto.calcularImposto();
        System.out.println(imposto);

        System.out.println("------------");

        Produto produto2 = new Tomate("Brasileiro",10);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());

        System.out.println("------------");
        Tomate tomate = new Tomate("Ban", 20);
        tomate.setDataValidade("10/03");
        System.out.println(tomate.getDataValidade());

    }
}
