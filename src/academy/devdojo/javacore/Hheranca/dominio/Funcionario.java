package academy.devdojo.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa{
    private Endereco trabalho;
    private double salario;

    static {
        System.out.println("Dentro do bloco de inicialização de funcionario");
    }{
        System.out.println("Dentro do bloco de inicialização de funcionario 1");
    }{
        System.out.println("Dentro do bloco de inicialização de funcionario 2");
    }

    @Override
    public void imprime() {
        super.imprime();
        System.out.println("endereço do trabalho: "+this.trabalho.getRua()+", "+this.trabalho.getBairro()+", "+this.trabalho.getCidade());
        System.out.println("salario: "+this.salario);
    }

    public Funcionario(String nome) {
        super(nome);
    }

    public void relatorioPagamento(){
        System.out.println("Eu "+this.nome+" recebi "+this.salario);
    }

    public Funcionario(Pessoa pessoa,Endereco trabalho, double salario) {
        super(pessoa.nome);
        setIdade(pessoa.getIdade());
        setCasa(pessoa.getCasa());
        setCpf(pessoa.getCpf());
        this.trabalho = trabalho;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Endereco getTrabalho() {
        return trabalho;
    }

    public void setTrabalho(Endereco trabalho) {
        this.trabalho = trabalho;
    }
}
