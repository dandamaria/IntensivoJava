package academy.devdojo.javacore.BintroducaoMetodos.test;

import academy.devdojo.javacore.BintroducaoMetodos.dominio.Estudante;
import academy.devdojo.javacore.BintroducaoMetodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new academy.devdojo.javacore.BintroducaoMetodos.dominio.Estudante();
        Estudante estudante2 = new academy.devdojo.javacore.BintroducaoMetodos.dominio.Estudante();

        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante.name = "Dandara";
        estudante.age = 17;
        estudante.sex = 'F';

        estudante2.name = "SidneyBar";
        estudante2.age = 13;
        estudante2.sex = 'M';

        impressora.imprime(estudante);
        System.out.println("----------");
        impressora.imprime(estudante2);

        System.out.println("-----");
        impressora.imprime(estudante);
        System.out.println("----------");
        impressora.imprime(estudante2);





    }
}
