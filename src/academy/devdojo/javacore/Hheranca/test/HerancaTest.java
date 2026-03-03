package academy.devdojo.javacore.Hheranca.test;

import academy.devdojo.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        Endereco enderecod = new Endereco();
        Endereco enderecot = new Endereco();
        Pessoa pessoa = new Pessoa("Pedro");
        Pessoa pessoau = new Pessoa("Maria");
        Funcionario funcionario = new Funcionario(pessoa.getNome());

        endereco.setRua("Rua Verão");
        endereco.setBairro("Castelones");
        endereco.setCidade("São Luís");


        enderecod.setCidade(endereco.getCidade());
        enderecod.setBairro(endereco.getBairro());
        enderecod.setRua("Rua Primavera");

        enderecot.setCidade("Lambão");
        enderecot.setBairro("Virgem Maria");
        enderecot.setRua("Olavo Bill");

        pessoa.setCasa(endereco);
        pessoa.setIdade(42);
        pessoa.setCpf(1001);

        pessoau.setCasa(enderecot);
        pessoau.setIdade(30);
        pessoau.setCpf(1342);

        funcionario.setCasa(pessoa.getCasa());
        funcionario.setCpf(pessoa.getCpf());
        funcionario.setIdade(pessoa.getIdade());
        funcionario.setTrabalho(enderecod);
        funcionario.setSalario(1500.90);
        funcionario.setNome(pessoa.getNome());

        Funcionario funcionariod = new Funcionario(pessoau,endereco,1700);

        pessoa.imprime();
        funcionario.imprime();
        funcionariod.imprime();

    }
}
