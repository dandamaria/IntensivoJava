package academy.devdojo.javacore.BintroducaoMetodos.test;

import academy.devdojo.javacore.BintroducaoMetodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa person = new Pessoa();
        Pessoa dands = new Pessoa();

        person.imprime();
        person.setName("Dandara");
        person.setAge(-1);
        person.imprime();
        System.out.println(person.getName());

        System.out.println("---------");
        System.out.println(dands.getAge());
    }
}
