package academy.devdojo.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//File
//FileWriter
//FileReader
//BufferedWriter
//BufferWriter
public class FileWriterTest {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileWriter fw = new FileWriter(file,true);) {
            fw.write("""
                mais uma linha""");
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
