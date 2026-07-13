package academy.devdojo.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File fileDiretorio = new File("folder");
        boolean isDiretorioCreated = fileDiretorio.mkdir(); //cria uma pasta "folder"
        System.out.println("Pasta criada? "+isDiretorioCreated);

        File fileArquivoDiretorio = new File(fileDiretorio,"arquivo.txt"); //endereço de um arquivo "arquivo.txt" dentro da pasta "folder"
        boolean isFileCreated = fileArquivoDiretorio.createNewFile(); //cria um arquivo "arquivo.txt"
        System.out.println("Arquivo.txt criado? "+isFileCreated);

        File fileRenamed = new File("newNameArquivo.txt"); //cria um arquivo "newNameArquivo.txt"
        boolean isRenamed = fileArquivoDiretorio.renameTo(fileRenamed); //renomea o "arquivo.txt" para "newNameArquivo.txt" e 'tira' ele de dentro da pasta "folder"
        System.out.println("arquivo.txt renomeado? "+isRenamed);

        File fileRenamed2 = new File(fileDiretorio, "newNameArquivo2.txt"); //endereço de um arquivo "newNameArquivo2.txt" dentro da pasta "folder"
        boolean isRenamed2 = fileArquivoDiretorio.renameTo(fileRenamed2); //se tiver um arquivo "arquivo.txt" dentro da pasta "folder", ele é renomeado para "newNameArquivo2.txt"
        System.out.println("arquivo.txt renomeado? "+isRenamed2);

        File fileDiretorioRenamed = new File("newNameFolder");
        boolean isDiretorioRenomeado = fileDiretorio.renameTo(fileDiretorioRenamed);
        System.out.println("diretorio renomeado? "+isDiretorioRenomeado);

    }
}
