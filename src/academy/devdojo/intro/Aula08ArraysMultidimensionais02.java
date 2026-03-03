package academy.devdojo.intro;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[4][];
        int[] arrayPraPuxar = {01, 02, 03};
        // variáveis de referência tem o padrão de inicialização nulo

        //da pra variar os tamanhos dos arrays: isso quer dizer que na posição i (esquerda) tenha um array de j posições dentro dele (direita)
        arrayInt[0] = new int[3];
        arrayInt[1] = new int[2];
        arrayInt[2] = new int[2];
        //outras formas de declarar:
        arrayInt[2] = new int[]{51, 42};
        arrayInt[3] = arrayPraPuxar;
        int[][] arrayInt2 = {{1, 2, 3}, {11, 12}, {23, 24, 25, 26}};


        for (int[] arrayBase : arrayInt) {
            System.out.println("\n-------");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
        }
        System.out.println("\n"+"\nArrayInt2");
        for (int[] arrayBase : arrayInt2) {
            System.out.println("\n-------");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
        }
    }
}
