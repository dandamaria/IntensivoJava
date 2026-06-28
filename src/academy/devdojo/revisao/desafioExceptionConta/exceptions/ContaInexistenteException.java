package academy.devdojo.revisao.desafioExceptionConta.exceptions;

public class ContaInexistenteException extends RuntimeException {
    public ContaInexistenteException(String message) {
        super(message);
    }
}
