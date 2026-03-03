package academy.devdojo.javacore.Hheranca.dominio;

import java.io.ObjectStreamException;

public class Pessoa{
    protected String nome;
    protected Endereco casa;
    protected int idade;
    protected int cpf;

    static {
        System.out.println("Dentro do bloco static de pessoa");
    }{
        System.out.println("Dentro do bloco static de pessoa 1");
    }{
        System.out.println("Dentro do bloco static de pessoa 2");
    }

    public Pessoa(){
        super();
    }

    public Pessoa(String nome){
        this.nome = nome;
        System.out.println("dentro do construtor de pessoa");
    }

    public Pessoa(String nome, int cpf){
        this(nome);
        this.cpf = cpf;
    }

    public void imprime(){
        System.out.println("-----------");
        System.out.println("nome: "+this.nome);
        System.out.println("endereço da casa: "+this.casa.getRua()+", "+this.casa.getBairro()+", "+this.casa.getCidade());
        System.out.println("portador do cpf: "+this.cpf+"\nidade: "+this.idade);
    }


    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getCasa() {
        return casa;
    }

    public void setCasa(Endereco casa) {
        this.casa = casa;
    }
}
