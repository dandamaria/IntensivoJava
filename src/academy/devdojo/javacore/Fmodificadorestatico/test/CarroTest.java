package academy.devdojo.javacore.Fmodificadorestatico.test;

import academy.devdojo.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro.setVelocidadeLimite(190);

        Carro car1 = new Carro("Audi", 195);
        Carro car2 = new Carro("Lambor", 210);

        car1.imprime();
        car2.imprime();
    }
}
