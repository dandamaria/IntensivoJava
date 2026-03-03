package academy.devdojo.intro;

public class Aula07Arrays01 {
    public static void main(String[] args) {
        int[] idades = {12,15,17};
        int[] numeroDasCasas = null;
        int[] nums = null; //definindo o tamanho desse array

        System.out.println(idades[0]);
        for(int i = 0; i < idades.length; i++){
            System.out.println("as idades são "+idades[i]);
        }
        System.out.println(idades[2]);
        //mudando valor de um elemento em um array
        idades[2] = 1;
        System.out.println(idades[2]);
        //mudando tamanho de um array
        nums = new int[5]; //era 4 agora é cinco
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        //outra forma de declarar e interar
        boolean[] afirmacoes = new boolean[]{true,false,false,true,false};
        for(boolean i: afirmacoes){
            System.out.println(i);
        }


    }
}
