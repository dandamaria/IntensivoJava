package academy.devdojo.revisao.desafioPolimorfismo;

public class Moto extends Transporte{
    @Override
    public void entrega() {
        System.out.println("Entrega de grandes cargas por BR - terrestre");
    }

    @Override
    public void alterarCapacidade(float novaCapacidade) {
        super.alterarCapacidade(novaCapacidade);
    }

    public Moto(String placa, float capacidade) {
        super(placa, capacidade);
    }

    @Override
    public String getPlaca() {
        return super.getPlaca();
    }

    @Override
    public void setPlaca(String placa) {
        super.setPlaca(placa);
    }

    @Override
    public float getCapacidade() {
        return super.getCapacidade();
    }
}
