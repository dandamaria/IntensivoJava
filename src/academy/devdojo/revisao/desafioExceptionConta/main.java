package academy.devdojo.revisao.desafioExceptionConta;

import academy.devdojo.revisao.desafioExceptionConta.exceptions.ValorInvalidoException;

public class main {
    public static void main(String[] args) {
        Conta roberto = new Conta("Roberto");
        Conta joao = new Conta("João");

        joao.depositar(500);
        joao.transferir(roberto, 200);
        joao.sacar(100);
        roberto.sacar(50);
        joao.consultarSaldo();
        roberto.consultarSaldo();
        joao.sacar(40);
        roberto.depositar(200000);
        try {
            roberto.transferir(joao,120000);

        }catch (RuntimeException e){
            System.out.println("Erro: "+e.getMessage());
        }finally {
            joao.consultarSaldo();
            roberto.consultarSaldo();
        }

    }
}
