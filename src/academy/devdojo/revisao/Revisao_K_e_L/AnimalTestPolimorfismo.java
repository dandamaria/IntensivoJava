package academy.devdojo.revisao.Revisao_K_e_L;

public class AnimalTestPolimorfismo {
    public static void main(String[] args) {
        Animal animal;
        animal = new Baleia("Lua", 200000F, TipoAnimal.SELVAGEM);
        System.out.println(animal.nome);

        animal = new Gato("Teste", 40F, TipoAnimal.DOMESTICO);
        System.out.println(animal.nome);

    }
}
