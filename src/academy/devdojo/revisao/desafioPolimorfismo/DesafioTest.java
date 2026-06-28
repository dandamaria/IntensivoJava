package academy.devdojo.revisao.desafioPolimorfismo;

public class DesafioTest {
    public static void main(String[] args) {
        Transporte transporte;
        transporte = new Caminhao("ASFC", 100000F);
        transporte.alterarCapacidade(120045F);

    }
}
