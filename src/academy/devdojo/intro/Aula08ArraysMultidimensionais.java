package academy.devdojo.intro;

public class Aula08ArraysMultidimensionais {
    public static void main(String[] args) {
        int[][] dias = new int[2][4];

        dias[0][0] = 1;
        dias[0][1] = 13;
        dias[0][2] = 1;
        dias[0][3] = 13;
        dias[1][0] = 1;
        dias[1][1] = 15;
        dias[1][2] = 1;
        dias[1][3] = 15;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }

        for(int[] arrBase : dias){
            for(int num : arrBase){
                System.out.println(num);
            }
        }

    }
}
