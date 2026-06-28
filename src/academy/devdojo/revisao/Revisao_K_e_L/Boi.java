package academy.devdojo.revisao.Revisao_K_e_L;

public class Boi extends Animal{
    public Boi(String nome, float peso, TipoAnimal tipo) {
        super(nome, peso, tipo);
    }

    @Override
    void dormir() {
        super.dormir();
    }

    @Override
    void acordar() {
        super.acordar();
    }

    @Override
    void emitirSom() {
        System.out.println("Muuuuuu");
    }
}
