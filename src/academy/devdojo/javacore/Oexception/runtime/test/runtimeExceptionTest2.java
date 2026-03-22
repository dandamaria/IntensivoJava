package academy.devdojo.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest2 {
    public static void main(String[] args) {
        divisao(1,0);
    }

    /**
     *
     * @param a
     * @param b não pode ser zero
     * @return
     * @throws IllegalArgumentException caso b seja zero
     */

    private static int divisao(int a, int b){
        if (b == 0){
            throw new IllegalArgumentException("Argumento inválido, não pode divisão por 0");
        }
        return a/b;
    }
}
