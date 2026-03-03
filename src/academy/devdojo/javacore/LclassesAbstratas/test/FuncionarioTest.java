package academy.devdojo.javacore.LclassesAbstratas.test;

import academy.devdojo.javacore.LclassesAbstratas.dominio.Desenvolvedor;
import academy.devdojo.javacore.LclassesAbstratas.dominio.Gerente;

public class FuncionarioTest {
    public static void main(String[] args) {

        //Funcionario funcionario = new Funcionario("Zorox", 2000); não funciona porque é abstratc class
        Gerente gerente = new Gerente("Zaia", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Dandara", 8000);

        System.out.println(gerente);
        System.out.println(desenvolvedor);

        gerente.imprime();
        desenvolvedor.imprime();


    }
}
