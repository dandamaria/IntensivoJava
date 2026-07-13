package academy.devdojo.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;

public class FileTest {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println(isCreated);
            System.out.println("path: "+file.getPath());
            System.out.println("absolute path: "+file.getAbsolutePath());
            System.out.println("is directory: "+file.isDirectory());
            System.out.println("is file: "+file.isFile());
            System.out.println("last modified: "+ Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()));
            if(file.exists()) {//verificar se o arquivo existe antes de deletar
                boolean isDeleted = file.delete();
                System.out.println(isDeleted);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
