package academy.devdojo.revisao.desafioPolimorfismo;

public abstract class Transporte {
    private String placa;
    private float capacidade;

    public void entrega(){
        System.out.println("entregando");
    }

    public void alterarCapacidade(float novaCapacidade){
        this.capacidade = novaCapacidade;
        System.out.println("capacidade alterada: " +this.capacidade);
    }

    public Transporte(String placa, float capacidade) {
        this.placa = placa;
        this.capacidade = capacidade;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public float getCapacidade() {
        return capacidade;
    }

}
