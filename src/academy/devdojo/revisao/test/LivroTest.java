package academy.devdojo.revisao.test;

import academy.devdojo.revisao.dominio.Livro;

public class LivroTest {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Java", "Nélio", false);
        Livro livro2 = new Livro("Spring", "Rodrigo", false);
        Livro livro3 = new Livro("O melhor de todos", "Ana Rosi", true);
        Livro livro4 = new Livro();
        Livro livro5 = new Livro();

        livro1.emprestar();

    }
}
