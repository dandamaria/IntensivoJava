package academy.devdojo.javacore.Aintroducaoclasses.test;

import academy.devdojo.javacore.Aintroducaoclasses.dominio.Estudante;

public class PessoaTest {
    public static void main(String[] args) {
        Estudante aluno1 = new Estudante();
        aluno1.name = "Sakura";
        aluno1.age = 17;
        aluno1.sex = 'F';

        System.out.println("O aluno " + aluno1.name + " tem "+aluno1.age + " de idade e é do sexo "+ aluno1.sex);
    }
}
