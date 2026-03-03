package academy.devdojo.javacore.LclassesAbstratas.dominio;

public class Gerente extends Funcionario{
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calculaBonus() {
        this.salario = salario + salario * 0.08;
    }

    @Override
    public void imprime() {
        System.out.println("imprimiu o método dentro de gerente");
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
