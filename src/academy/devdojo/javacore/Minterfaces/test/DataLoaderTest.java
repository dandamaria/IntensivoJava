package academy.devdojo.javacore.Minterfaces.test;

import academy.devdojo.javacore.Minterfaces.dominio.DataBaseLoader;
import academy.devdojo.javacore.Minterfaces.dominio.DataLoader;
import academy.devdojo.javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTest {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();

        dataBaseLoader.load();
        fileLoader.load();

        dataBaseLoader.remove();
        fileLoader.remove();

        dataBaseLoader.checkPermission();
        fileLoader.checkPermission();

        DataLoader.retrieveMaxDataSize();
        DataBaseLoader.retrieveMaxDataSize();
    }
}
