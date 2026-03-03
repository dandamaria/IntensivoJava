package academy.devdojo.javacore.Minterfaces.dominio;

public class DataBaseLoader implements DataLoader,DataRemove{
    @Override
    public void load() {
        System.out.println("carregando dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("removendo dados de um banco de dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("checando permissions no banco de dados");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize dentro de DataBaseLoader");
    }
}
