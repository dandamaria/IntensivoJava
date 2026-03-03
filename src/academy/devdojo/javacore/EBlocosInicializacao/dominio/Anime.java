package academy.devdojo.javacore.EBlocosInicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;

    { //bloco em qualquer lugar do cógido que é executado sempre que é criado uma isntância desse objeto
        System.out.println("Dentro edo bloc de inciiton");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int ep: this.episodios){
            System.out.println("Episódio "+ep);
        }
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
