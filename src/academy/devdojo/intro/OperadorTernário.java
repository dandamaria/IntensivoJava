package academy.devdojo.intro;

public class OperadorTernário {
    public static void main(String[] args) {
        int idade = 18;
        String aprovado = "Tá aprovado, pode passar";
        String nao_aprovado = "Tá aprovado não, pode ficar aqui";

        String resultado = (idade >= 18)?aprovado:nao_aprovado;
        System.out.println(resultado);
        Exercicio2 exercicio2 = new Exercicio2();
        exercicio2.executar();

    }
    static class Exercicio2{
        //calcular desconto, se x>100, desconto = 10%, caso contrário, desconto = 5%
        public void executar(){
            double valor = 105;
            double desconto10 = valor - (0.1 * valor);
            double desconto5 = valor - 0.05*valor;
            double resultado = (valor>=100? desconto10 : desconto5) ;

            System.out.println(resultado);
        }

    }
}
