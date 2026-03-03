package academy.devdojo.javacore.Minterfaces.dominio;

public class FileLoader implements DataLoader,DataRemove{

    @Override
    public void load() {
        System.out.println("carregando dados de um arquivo");
    }

    @Override
    public void remove() {
        System.out.println("deletando dados de um arquivo");
    }

    @Override
    public void checkPermission() {
        System.out.println("checando permissions do arquivo");
    }
}
