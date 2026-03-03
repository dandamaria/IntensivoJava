package academy.devdojo.javacore.Gassociacao.dominio;

public class Jogador {

    private String nome;
    private int idade;
    private Time time;


    public Jogador(String nome, int idade, Time time) {
        this.nome = nome;
        this.idade = idade;
        this.time = time;
    }
    public Jogador(String nome, int idade){
        this.nome = nome;
    }
    public Jogador(String nome){
        this.nome = nome;
    }
    public void imprimeInfos(){
        System.out.println(this.nome);
        if(time != null){
            System.out.println(this.time);
        }
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void nomes(){
        System.out.println(this.nome);
    }
}
