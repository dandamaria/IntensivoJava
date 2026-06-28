package academy.devdojo.revisao;

import java.util.Scanner;

public class ExercicioArrays {
    public static void main(String[] args) {
        /*
        recebe uma matriz - calcula a sua transposta - retorna essa matriz transposta
         */
        Scanner linhas = new Scanner(System.in);
        Scanner colunas = new Scanner(System.in);
        Scanner valor = new Scanner(System.in);

        System.out.println("informe a quantidade de linhas e colunas");
        int qtdLinha = linhas.nextInt();
        int qtdColuna = colunas.nextInt();

        int[][] matriz = new int[qtdLinha][qtdColuna];

        for(int i=0;i<qtdLinha; i++){
            for(int j=0; j<qtdColuna; j++){
                System.out.println("Informe qual o número da linha "+(i+1)+" coluna "+(j+1));
                matriz[i][j] = valor.nextInt();
            }
        }

        System.out.println("matriz: \n");

        for(int i=0; i<qtdLinha; i++){
            for(int j=0; j<qtdColuna; j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println(" ");
        }

        System.out.println("matriz transposta: \n");

        int [][] matrizt = new int[qtdColuna][qtdLinha];

        for(int i=0; i<qtdLinha; i++){
            for(int j=0; j<qtdColuna; j++){
                matrizt[j][i] = matriz[i][j];
            }
        }

        for(int i=0; i<qtdColuna; i++){
            for(int j=0; j<qtdLinha; j++){
                System.out.print(matrizt[i][j]);
            }
            System.out.println(" ");
        }


    }
}
