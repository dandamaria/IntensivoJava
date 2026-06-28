package academy.devdojo.revisao.Revisao_K_e_L;

public abstract class Animal {

    protected TipoAnimal tipo;
    protected String nome;
    protected float peso;

    public Animal(String nome, float peso, TipoAnimal tipo){
        this.nome = nome;
        this.peso = peso;
        this.tipo = tipo;
        acordar();
    }

    void dormir(){
        System.out.println("está dormindo");
    }
    void acordar(){
        System.out.println("o(a) "+this.nome+" está acordado");
    }
    void emitirSom(){
        System.out.println("som de animal");
    }

}
