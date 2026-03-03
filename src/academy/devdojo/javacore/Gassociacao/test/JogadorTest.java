package academy.devdojo.javacore.Gassociacao.test;

import academy.devdojo.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest {

    public static void main(String[] args) {

        Jogador jogador1 = new Jogador("marta",50);
        Jogador jogador2 = new Jogador("neymaro",60);
        Jogador jogador3 = new Jogador("tata",30);
        Jogador jogador4 = new Jogador("l wondisk",33);
        Jogador jogador5 = new Jogador("roberto",48);
        Jogador jogador6 = new Jogador("dandara",18);

        //Jogador[] time = new Jogador[3];
        Jogador[] time = {jogador1,jogador2,jogador3, jogador4, jogador5, jogador6};
        Jogador[] timeFem = new Jogador[]{jogador1,jogador3,jogador6};
        Jogador[] timeMas = new Jogador[]{jogador2,jogador5,jogador4};

        for (Jogador jogador : time){
            System.out.println(jogador.getNome());
        }

        for(Jogador jogador : time){
            jogador.imprimeInfos();
        }
    }
}
