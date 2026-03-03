package academy.devdojo.javacore.Kenum.test;

import academy.devdojo.javacore.Kenum.dominio.Cliente;
import academy.devdojo.javacore.Kenum.dominio.TipoCliente;
import academy.devdojo.javacore.Kenum.dominio.TipoPagamento;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Verônica ", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Stefani ", TipoCliente.PESSOA_JURIDICA);
        Cliente cliente3 = new Cliente("Buena Smith ", TipoCliente.PESSOA_FISICA);
        Cliente cliente4 = new Cliente("Hahaha de Raio Lazer ", TipoCliente.PESSOA_NADA);

        System.out.println(cliente);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);

        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        System.out.println(TipoPagamento.DINHEIRO.calcularDesconto(100));

        TipoCliente tipoCliente =  TipoCliente.valueOf("PESSOA_FISICA");
        TipoCliente tipoCliente2 =  TipoCliente.tipoClienteForRelationName("pessoa física");
        System.out.println(tipoCliente);
        System.out.println(tipoCliente2);
        TipoCliente tipoCliente3 = TipoCliente.tipoClienteForNumber(2);
        System.out.println(tipoCliente3);



    }
}
