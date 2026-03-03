package academy.devdojo.javacore.CsobrecargaMetodos.test;

import academy.devdojo.javacore.CsobrecargaMetodos.dominio.Dorama;

public class DoramaTest {
    public static void main(String[] args) {
        Dorama newDorama = new Dorama();
        Dorama oldDorama = new Dorama();
        Dorama dois = new Dorama();

        newDorama.setNome("Rainha das Lágrimas");
        newDorama.setGenero("Romance");
        newDorama.setQtdEpisodios(20);
        newDorama.setTemporadas(3);

        //isso é graças ao método init
        oldDorama.init("O amor mora ao lado", "romance", 30);
        newDorama.setNome("Mudou");
        dois.init("Ação", "Jujao",10, 2);

        oldDorama.setNome("Esquíne");

    }
}
