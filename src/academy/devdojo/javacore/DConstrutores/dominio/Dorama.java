package academy.devdojo.javacore.DConstrutores.dominio;

public class Dorama {
    private String genero;
    private String nome;
    private int qtdEpisodios;
    private int temporadas;
    private String studio;

    //construtor -> não tem retorno, porque se tiver vira método e não construtor
    public Dorama(String nome, String genero) {
        System.out.println("dentro do OUTRO construtor: ");
        init(genero, nome);
        this.nome = nome;
    }
    public Dorama(String nome, String genero, int qtdEpisodios, int temporadas){

    }

    public Dorama(String nome, String genero,String studio){
        //this.Dorama isso não existe aqui, seria:
        this(genero,nome);//e um DETALHE -> tem que ser aqui na primeira linha
        this.studio = studio;
        if(qtdEpisodios == 0){
            imprime(genero,nome);
        }else {
            imprime(qtdEpisodios, temporadas);
        }
    }

    public void init(String genero, String nome) {
        this.genero = genero;
        this.nome = nome;
    }

    public void init(String genero, String nome, int qtdEpisodios) {
        this.genero = genero;
        this.nome = nome;
        this.qtdEpisodios = qtdEpisodios;
    }

    public void init(String genero, String nome, int qtdEpisodios, int temporadas) {
        init(genero, nome, qtdEpisodios);
        this.temporadas = temporadas;
    }

    public void imprime(String genero, String nome){
        System.out.println(this.nome);
        System.out.println(this.genero);
        System.out.println(this.studio);
    }
    public void imprime(int qtdEpisodios, int temporadas){
        System.out.println(this.nome);
        System.out.println(this.genero);
        System.out.println(this.qtdEpisodios);
        System.out.println(this.temporadas);
        System.out.println(this.studio);
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return this.genero;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setQtdEpisodios(int qtdEpisodios) {
        this.qtdEpisodios = qtdEpisodios;
    }

    public int getQtdEpisodios() {
        return this.qtdEpisodios;
    }
}
