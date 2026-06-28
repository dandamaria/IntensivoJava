package academy.devdojo.revisao.desafioExceptionConta;

import academy.devdojo.revisao.desafioExceptionConta.exceptions.ContaBloqueadaException;
import academy.devdojo.revisao.desafioExceptionConta.exceptions.TransferenciaInvalidaException;
import academy.devdojo.revisao.desafioExceptionConta.exceptions.ValorInvalidoException;

public class Conta {

    private double saldo = 0;
    private boolean bloqueada;
    private final String titular;

    public Conta(String titular){
        this.titular = titular;
    }
    public Conta(double saldo, boolean bloqueada, String titular) {
        this.saldo = saldo;
        this.bloqueada = bloqueada;
        this.titular = titular;
    }

    public void depositar(double valor){
        if(bloqueada){
            throw new ContaBloqueadaException(this.titular);
        } else if(valor<=0){
            throw new ValorInvalidoException("O valor de deposito deve ser maior que zero");
        }else {
            this.saldo += valor;
        }
    }

    public void sacar(double valor){
        if(bloqueada){
            throw new ContaBloqueadaException(this.titular);
        }else if(valor>this.saldo){
            throw new ValorInvalidoException("O valor de saque é maior do que o saldo da conta");
        }else{
            this.saldo-=valor;
        }
    }

    public void transferir(Conta conta, double valor){
        if(conta == null){
            throw new TransferenciaInvalidaException("Conta inexistente");
        }
        if(conta == this){
            throw new TransferenciaInvalidaException("Você está tentando transferir pra si mesmo");
        }
        sacar(valor);
        conta.depositar(valor);
        if(valor>100000){
            setBloqueada();
            throw new ContaBloqueadaException(this.titular);
        }

    }

    private void setBloqueada(){
        this.bloqueada = true;
    }

    public void consultarSaldo(){
        System.out.println("titular: "+this.titular+" seu saldo é: R$"+getSaldo());
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

}
