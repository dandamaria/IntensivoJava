package academy.devdojo.javacore.LclassesAbstratas.dominio;

public abstract class Funcionario extends Pessoa {
    //não pode ser chamada como "new"
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }

    public abstract void calculaBonus();

    @Override
    public void imprime() {
        System.out.println("Imprimiu!! dentro de funcionario");
    }
}
