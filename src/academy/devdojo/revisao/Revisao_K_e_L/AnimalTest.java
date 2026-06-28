package academy.devdojo.revisao.Revisao_K_e_L;

public class AnimalTest {
    public static void main(String[] args) {

        Boi animal = new Boi("maumau", 1300.60F, TipoAnimal.PRODUCAO);
        Gato animal2 = new Gato("Nana", 30.6F, TipoAnimal.DOMESTICO);
        Baleia animal3 = new Baleia("Moana", 153000.8500F, TipoAnimal.SELVAGEM);

        System.out.println(animal.nome+": ");
        animal.emitirSom();
        System.out.println(animal3.nome+": ");
        animal3.emitirSom();

        System.out.println(animal2.nome+": ");
        System.out.println("é um animal do tipo 2 que são do tipo: "+TipoAnimal.tipoAnimalForRelationId(2).getAcao());

    }
}
