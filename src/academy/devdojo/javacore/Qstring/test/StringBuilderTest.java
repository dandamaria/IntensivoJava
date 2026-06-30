package academy.devdojo.javacore.Qstring.test;

public class StringBuilderTest {
    public static void main(String[] args) {
        String nome = "Dandara Maria";
        nome.concat("DevDojo");
        System.out.println(nome);

        System.out.println("----------------");

        //Tudo que vale aqui pra StringBuilder também vale pra StringBuffer
        StringBuilder sb = new StringBuilder("Dandara"); //capacity = 16 padrão
        // sb = nome; Isso não existe
        System.out.println(sb); // = System.out.println(sb.toString());
        sb.append(" Maria");
        System.out.println(sb);
        sb.append(" da").append(" Silva ");
        System.out.println(sb);
        sb.substring(0,2);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.reverse();
        sb.delete(0,3);
        System.out.println(sb);
    }
}
