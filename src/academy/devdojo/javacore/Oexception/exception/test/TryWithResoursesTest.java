package academy.devdojo.javacore.Oexception.exception.test;

import academy.devdojo.javacore.Oexception.exception.dominio.Leitor1;
import academy.devdojo.javacore.Oexception.exception.dominio.Leitor2;

import java.io.*;

public class TryWithResoursesTest {
    public static void main(String[] args) {
        lerArquivo1();
    }

    //Como o lerArquivo2 é FEIO, criou-se o try-with-resources:
    //Quuando se trabalha com try-with-resources pode criar só o try - sem o catch - mas precisaria incluir um 'throws' no nome da classe
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
            //o reader tem um metodo close que vai lá pro finally
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            //o close() também pode lançar uma exception do tipo NullPointerExeception porque o reader poderia ser "null"
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
