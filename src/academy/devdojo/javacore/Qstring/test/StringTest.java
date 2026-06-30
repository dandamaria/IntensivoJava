package academy.devdojo.javacore.Qstring.test;

public class StringTest {
    public static void main(String[] args) {
        String nome = "Dandara"; //String constant pool
        String nome2 = "Dandara";
        String sobrenome = "Maria";
        System.out.println(nome.equals(nome2));
        System.out.println(nome == nome2);
        nome.concat(sobrenome); //não existe uma variável de referência pra ela
        System.out.println(nome);
        nome = nome.concat(sobrenome);
        System.out.println(nome);

        String nome3 = new String("Dandara");

        System.out.println(nome2 == nome3); //é false porque nome3 faz referência pro um objeto que está fora da "String pool"
        System.out.println(nome2 == nome3.intern());

        

    }
}
