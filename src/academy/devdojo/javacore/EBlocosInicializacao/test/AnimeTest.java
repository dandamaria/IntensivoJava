package academy.devdojo.javacore.EBlocosInicializacao.test;

import academy.devdojo.javacore.EBlocosInicializacao.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();
        for (int ep : anime.getEpisodios()){
            System.out.println("episódio "+ep);
        }
    }
}
