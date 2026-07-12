package academy.devdojo.javacore.Uregex.test;

public class ScannerTest {
    public static void main(String[] args) {
        String texto = "Levi, Eren, Mikasa, true, 2000";
        String[] nomes = texto.split(",");
        for (String nome : nomes){
            System.out.println(nome);
            System.out.println(nome.trim());
        }
    }
}
