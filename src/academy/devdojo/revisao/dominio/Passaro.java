package academy.devdojo.revisao.dominio;

public class Passaro implements voador{
    //como essa classe Passaro implementa um voador, obrigatoriamente precisa ter o mesmo metodo que tem em 'voador'.
    @Override
    public void voar() {
        System.out.println("o pássaro pode voar e está voando, obrigatoriamente");
    }
}
