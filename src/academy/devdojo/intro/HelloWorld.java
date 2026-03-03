package academy.devdojo.intro;

public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello World");
        int age = 17;
        String name = "Dandara";
        float peso = 65.5f;
        double altura = 1.70;
        //long, byte
        boolean legal = true;
        boolean chatona = false;

        int num1 = 10;
        int num2 = 20;
        double somasdiferentes = num1 / (double) num2;

        int resto = 20%2;

        //operadores lógicos return boolean
        // > < == !=

        boolean teste = 4!=2;
        boolean teste2 = 10==10.10;

        System.out.println(teste2);
        System.out.println(somasdiferentes + " " + resto);
    }

}
