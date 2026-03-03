package academy.devdojo.javacore.CsobrecargaMetodos.dominio;

public class Dorama {
    private String genero;
    private String nome;
    private int qtdEpisodios;
    private int temporadas;

    //construtor
    public Dorama(){

    }
    //esse método init faz a inicialização de todo as variáveis sendo passadas de uma só vez
   public void init(String genero, String nome){
       this.genero = genero;
       this.nome = nome;
   }
    public void init(String genero, String nome, int qtdEpisodios){
        this.genero = genero;
        this.nome = nome;
        this.qtdEpisodios = qtdEpisodios;
    }
    public void init(String genero, String nome, int qtdEpisodios, int temporadas){
        init(genero,nome,qtdEpisodios);
        this.temporadas = temporadas;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }
    public String getGenero(){
        return this.genero;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setQtdEpisodios(int qtdEpisodios){
        this.qtdEpisodios = qtdEpisodios;
    }
    public int getQtdEpisodios(){
        return this.qtdEpisodios;
    }
}
