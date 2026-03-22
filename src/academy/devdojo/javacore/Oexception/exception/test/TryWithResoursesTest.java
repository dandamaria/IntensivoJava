package academy.devdojo.javacore.Oexception.exception.test;

import academy.devdojo.javacore.Oexception.exception.dominio.Leitor1;
import academy.devdojo.javacore.Oexception.exception.dominio.Leitor2;

import java.io.*;

public class TryWithResoursesTest {
    public static void main(String[] args) {
        lerArquivo1();
    }

    public static void lerArquivo1(){
        try(Leitor1 leitor1 = new Leitor1();
            Leitor2 leitor2 = new Leitor2()){

        } catch (IOException e) {

        }
    }

    public static void lerArquivo2() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
