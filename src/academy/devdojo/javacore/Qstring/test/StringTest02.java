package academy.devdojo.javacore.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "Luffy";
        String nome2 = "    bananatan tanra     ";
        String numeros = "012345";
        System.out.println(nome.charAt(0));
        System.out.println(nome.replace("f","l"));
        System.out.println(nome);
        System.out.println(nome.toLowerCase());
        System.out.println(numeros.length());
        System.out.println(numeros.substring(0,3));
        System.out.println(nome2.substring(3,nome2.length()));
        System.out.println(nome2.trim());
    }
}
