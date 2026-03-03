package academy.devdojo.javacore.BintroducaoMetodos.dominio;

public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(10 + 20);
    }

    public void subtraiDoisNumeros() {
        System.out.println(1 - 5);
    }

    public void multiplicaDoisNumeros(int a, int b) {
        System.out.println(a * b);
    }

    public void outrosExemplos(int a, float b, boolean logico) {
        System.out.println("não é bom ter métodos com mais de três entradas, a partir dai é melhor separar em outros métodos"
                + a + b + logico);
    }

    public double divideDoisNumeros(double num1, double num2) {
        return num1 / num2;
    }

    public void ImprimeDivisaoDoisNumeros(double num, double num1) {
        if (num1 != 0) {
            System.out.println(num / num1);
            return; //um break para métodos void
        }
        System.out.println(0);

    }

    public void alteraDoisNumeros(int a, int b) {
        a = 90;
        b = 30;
        System.out.println(a + " " + b);
    }

    public void somaArray(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros) {
        //aqui ele pode ler (1,2,3,4) sem precisar ser um array
        //alguns poréns são: o VarArgs que precisa ser o último parâmetro solicitado
        //senão acontece que ele não vai diferenciar a lista dos VarArgs e as outras informações porquê tudo tá separado por vírgula
        int soma = 0;
        for(int i : numeros){
            soma += i;
        }
        System.out.println("a soma é "+soma);
    }


}
