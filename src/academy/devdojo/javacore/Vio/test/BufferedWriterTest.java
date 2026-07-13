package academy.devdojo.javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileWriter fw = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(fw)) {
            /*bw.write("""
                O dev dojo é o melhor curso do Brasil!
                Continua
                mais uma linha""");*/
            bw.write("Testando 1 ");
            bw.write("Testando 2 ");
            bw.newLine();
            bw.write("Testando 3 ");
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
