package academy.devdojo.javacore.Aintroducaoclasses.test;

import academy.devdojo.javacore.Aintroducaoclasses.dominio.Car;

public class CarTest {
    public static void main(String[] args) {
        Car carro1 = new Car();
        Car carro2 = new Car();

        carro1.nome = "McWinn";
        carro1.modelo = "Safari";
        carro1.ano = 2014;

        carro2.nome = "Rex";
        carro2.modelo = "Tirano";
        carro2.ano = 2020;

        //carro1 = carro2; //aqui a primeira referência de carro1 se perde
        //pra voltar só se tivesse uma terceira variável com aquele mesmo objeto;
        carro2 = carro1;

        System.out.println("\n carro 1");
        System.out.println(carro1.nome+" "+carro1.modelo+" "+carro1.ano);
        System.out.println("\n carro 2");
        System.out.println(carro2.nome+" "+carro2.modelo+" "+carro2.ano);

    }
}
