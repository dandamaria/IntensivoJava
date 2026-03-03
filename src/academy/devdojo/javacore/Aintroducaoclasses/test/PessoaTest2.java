package academy.devdojo.javacore.Aintroducaoclasses.test;

import academy.devdojo.javacore.Aintroducaoclasses.dominio.Estudante;

public class PessoaTest2 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante2.name = "Sanki";

        System.out.println(estudante2.name);
        System.out.println("----------");
        System.out.println(estudante.name);

    }
}
