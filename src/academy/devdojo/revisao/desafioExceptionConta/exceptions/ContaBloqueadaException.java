package academy.devdojo.revisao.desafioExceptionConta.exceptions;

public class ContaBloqueadaException extends RuntimeException{

    public ContaBloqueadaException(String nome) {
        System.out.println("titular: "+nome+" conta bloqueada");
    }
}
