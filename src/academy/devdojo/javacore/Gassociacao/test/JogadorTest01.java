package academy.devdojo.javacore.Gassociacao.test;

import academy.devdojo.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.javacore.Gassociacao.dominio.Time;

public class JogadorTest01 {
    public static void main(String[] args) {

        Jogador player1 = new Jogador("Lorena");
        Jogador player2 = new Jogador("Isa Hass");
        Jogador player3 = new Jogador("Bruna Calderan");
        Jogador player4 = new Jogador("Duda Sampaio");
        Jogador player5 = new Jogador("Ya ya");
        Jogador player6 = new Jogador("Jhonson");

        Time time1 = new Time("Seleção Brasileira 2025");

        player1.setTime(time1);

        player3.imprimeInfos();

    }
}
