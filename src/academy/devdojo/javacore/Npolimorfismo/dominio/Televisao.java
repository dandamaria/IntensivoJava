package academy.devdojo.javacore.Npolimorfismo.dominio;

public class Televisao extends Produto{

    @Override
    public double calcularImposto() {
        return this.valor * 0.050;
    }

    public Televisao(String nome, double valor) {
        super(nome, valor);
    }
}
