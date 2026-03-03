package academy.devdojo.javacore.BintroducaoMetodos.dominio;

public class ImpressoraEstudante {
    public void imprime(Estudante sio){

        System.out.println(sio.name);
        System.out.println(sio.age);
        System.out.println(sio.sex);

        sio.name = "MudouDeNome Rapá";
    }
}
