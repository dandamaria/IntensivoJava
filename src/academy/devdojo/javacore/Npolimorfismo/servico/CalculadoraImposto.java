package academy.devdojo.javacore.Npolimorfismo.servico;

import academy.devdojo.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    //uso do polimorfismo aqui, metodo sendo usado de forma genérica
    public static void CalcularImposto(Produto produto){
        System.out.println("Relatório imposto");
        double imposto = produto.calcularImposto();
        System.out.println("nome: "+produto.getNome());
        System.out.println("valor: "+produto.getValor());
        System.out.println("imposto a ser pago: "+imposto);

        //cast e instaceof
        if (produto instanceof Tomate) {
            Tomate tomate = (Tomate) produto;
            String dataVal = ((Tomate) produto).getDataValidade();
            System.out.println("outro jeito de mostrar a data de validade: "+ dataVal);
            System.out.println("Data de validade: " + tomate.getDataValidade());
        }

    }
}
