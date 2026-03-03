package academy.devdojo.javacore.Jmodificadorfinal.test;

import academy.devdojo.javacore.Jmodificadorfinal.dominio.Carro;
import academy.devdojo.javacore.Jmodificadorfinal.dominio.Comprador;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);

        Comprador comprador = new Comprador();

        // não pode pq é final: carro.COMPRADOR = new Comprador();
        // mas pode isso:
        carro.COMPRADOR.setNome("Buz");

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);

    }
}
