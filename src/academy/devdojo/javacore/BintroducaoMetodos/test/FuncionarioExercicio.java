package academy.devdojo.javacore.BintroducaoMetodos.test;

import academy.devdojo.javacore.BintroducaoMetodos.dominio.Funcionario;

public class FuncionarioExercicio {
    public static void main(String[] args) {
        Funcionario Cacau = new Funcionario();
        Funcionario Dudu = new Funcionario();

        Cacau.setName("Cauane");
        Cacau.setAge(18);
        Cacau.setSalary(new float[]{20000.5F, 20000, 17000.500F, 50000F});

        Dudu.setName("Eduardo");
        Dudu.setAge(20);
        //Dudu.salary = new float[]{2500,8000.50F};

        Cacau.imprimeDados();
        Dudu.imprimeDados();

    }
}
