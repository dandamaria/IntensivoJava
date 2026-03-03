package academy.devdojo.javacore.Minterfaces.dominio;

public interface DataLoader {

    static final int MAX_DATA_SIZE = 12;
    public abstract void load();
    default void checkPermission(){
        System.out.println("chegando as permissões");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize dentro de DataLoader");
    }

}
