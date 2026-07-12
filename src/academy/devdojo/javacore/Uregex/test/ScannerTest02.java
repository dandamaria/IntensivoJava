package academy.devdojo.javacore.Uregex.test;

import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args) {
        String texto = "Levi,Eren,Mikasa,true,2000";
        Scanner scanner = new Scanner(texto);
        scanner.useDelimiter(","); //vai usar esse regex como delimitador
        while (scanner.hasNext()){ //enquanto existir um próximo
            //na hora que chegar no "2000" ele vai dar um false e sair do while
            if(scanner.hasNextInt()){
                int i = scanner.nextInt();
                System.out.println("int: "+i);
            }else if (scanner.hasNextBoolean()){
                boolean b = scanner.nextBoolean();
                System.out.println("boolean: "+b);
            }else{
                System.out.println(scanner.next());
            }
        }
    }
}
