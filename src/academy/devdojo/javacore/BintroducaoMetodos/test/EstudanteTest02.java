package academy.devdojo.javacore.BintroducaoMetodos.test;

import academy.devdojo.javacore.BintroducaoMetodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {

        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante.name = "Dandara";
        estudante.age = 17;
        estudante.sex = 'F';

        estudante2.name = "SidneyBar";
        estudante2.age = 13;
        estudante2.sex = 'M';

        estudante.imprime();
        estudante2.imprime();
    }
}
