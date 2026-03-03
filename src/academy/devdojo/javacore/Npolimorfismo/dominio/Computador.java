package academy.devdojo.javacore.Npolimorfismo.dominio;

public class Computador extends Produto{
    public static final double IMPOSTO = 0.013;
    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do Computador");
        return this.valor * IMPOSTO;
    }
}
