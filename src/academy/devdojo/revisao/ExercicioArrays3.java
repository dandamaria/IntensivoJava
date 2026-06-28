package academy.devdojo.revisao;

public class ExercicioArrays3 {

    /*
    uma função que retorne os valores dessa mesma função multiplicados pelo maior valor da função original
     */

    public int[] multiplicador(int[] vetor){
        int maiorValor = vetor[0];
        int []ve = new int[vetor.length];

        for(int v : vetor){
            if(v>maiorValor){
                maiorValor = v;
            }
        }
        for(int i=0; i<vetor.length; i++){
            ve[i] = vetor[i]*maiorValor;
        }
        return ve;
    }

    public static void main(String[] args) {
        ExercicioArrays3 function = new ExercicioArrays3();
        int[] vetor = {1,2,10,2,5,6};
        int[] novoV = function.multiplicador(vetor);
        for(int i=0; i<vetor.length; i++){
            System.out.print(" "+novoV[i]);
        }
    }

}
