package academy.devdojo.javacore.Npolimorfismo.test;

import academy.devdojo.javacore.Npolimorfismo.repositorio.Repositorio;
import academy.devdojo.javacore.Npolimorfismo.servico.RepositorioArquivo;
import academy.devdojo.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorioGenerico = new RepositorioArquivo();
        Repositorio repositorio = new RepositorioBancoDeDados();

        repositorioGenerico.salvar();
        repositorio.salvar();

    }
}
