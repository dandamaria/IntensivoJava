package academy.devdojo.javacore.Kenum.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "pessoa física"),
    PESSOA_JURIDICA(2, "pessoa jurídica"),
    PESSOA_NADA(3, "nem é pessoa");

    public final int valor;
    public final String nome;

    TipoCliente(int valor, String nome){
        this.valor = valor;
        this.nome = nome;
    }

    public static TipoCliente tipoClienteForRelationName(String nomeRelatorio){
        for (TipoCliente tipoCliente : values()){
            if(tipoCliente.getNomeRelatorio().equals(nomeRelatorio)){
                return tipoCliente;
            }
        }
        return null;
    }

    public static TipoCliente tipoClienteForNumber(int number){
        for (TipoCliente tipoCliente : values()){
            if (tipoCliente.getValor() == number){
                return tipoCliente;
            }
        }
        return null;
    }

    public String getNomeRelatorio(){
        return nome;
    }

    public int getValor() {
        return valor;
    }
}
