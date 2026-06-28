package academy.devdojo.revisao.desafioExceptionConta;

import academy.devdojo.revisao.desafioExceptionConta.exceptions.ContaInexistenteException;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> contas = new ArrayList<>();

    public void adicionarConta(Conta conta){
        contas.add(conta);
    }
    public Conta buscarConta(String titular){
        for(Conta c : contas){
            if(c.getTitular().equals(titular)){
                return c;
            }
        }
        throw new ContaInexistenteException("Essa conta não existe");
    }


}
