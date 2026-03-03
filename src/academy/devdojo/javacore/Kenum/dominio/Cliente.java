package academy.devdojo.javacore.Kenum.dominio;

import java.security.PublicKey;

public class Cliente {

    private String nome;
    private TipoCliente tipo;
    private TipoPagamento tipoPagamento;

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipo=" + tipo +
                ", valor do tipo="+ tipo.valor +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }

    public Cliente(String nome, TipoCliente tipo, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipo = tipo;
        this.tipoPagamento = tipoPagamento;
    }

    public Cliente(String nome, TipoCliente tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipo() {
        return tipo;
    }

    public void setTipo(TipoCliente tipo) {
        this.tipo = tipo;
    }
}
