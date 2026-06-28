package academy.devdojo.revisao;

public class ExercicioArrays2 {

    public int[][] matrizT(int linhas, int colunas, int[][] matriz){
        int[][] matrizt = new int[colunas][linhas];
        for(int i=0; i<linhas; i++){
            for(int j=0; j<colunas; j++){
                matrizt[j][i] = matriz[i][j];
            }
        }
        return matrizt;
    }

    public static void main(String[] args) {
        /*
        mesma coisa do exercício anterior, mas agora em formato de função.
         */
        ExercicioArrays2 function = new ExercicioArrays2();


        int [][] mt = {
                {1,3,5},
                {2,4,6}
        };

        for(int i=0; i<3; i++){
            for(int j=0; j<2; j++){
                System.out.print(function.matrizT(2,3,mt)[i][j]);
            }
            System.out.println(" ");
        }

    }
}
