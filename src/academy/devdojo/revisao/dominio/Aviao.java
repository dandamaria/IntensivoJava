package academy.devdojo.revisao.dominio;

public class Aviao implements voador{
    @Override
    public void voar() {
        System.out.println("O avião pode voar e está voando");
    }
}
