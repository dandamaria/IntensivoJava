package academy.devdojo.revisao.Revisao_K_e_L;

public enum TipoAnimal {
//selvagem, doméstico, produção
    SELVAGEM(1, "que corre atrás de uma presa"),
    DOMESTICO(2, "companheiros"),
    PRODUCAO(3, "que produz algo para o ser humano");

    public final int id;
    public final String acao;

    TipoAnimal(int id, String acao) {
        this.id = id;
        this.acao = acao;
    }

    public static TipoAnimal tipoAnimalForRelationId(int id){
        for(TipoAnimal a : values()){
            if(a.getId()==id){
                return a;
            }
        }
        return null;
    }

    public String getAcao() {
        return acao;
    }

    public int getId() {
        return id;
    }
}
