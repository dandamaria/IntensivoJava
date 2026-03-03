package academy.devdojo.javacore.Gassociacao.test;

import academy.devdojo.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor("joao");
        Professor professora = new Professor("maria");
        Escola escola = new Escola("Javali School");

        Professor profs[] = {professor,professora};

        Escola escola1 = new Escola("superheros", profs);

        escola1.imprime();
    }
}
