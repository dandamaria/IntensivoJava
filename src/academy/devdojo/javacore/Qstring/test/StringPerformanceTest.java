package academy.devdojo.javacore.Qstring.test;

public class StringPerformanceTest {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(130_000);
        long fim = System.currentTimeMillis();
        System.out.println("tempo gasto: "+(fim-inicio)+"ms");

        inicio = System.currentTimeMillis();
        concatStringBuilder(130_000);
        fim = System.currentTimeMillis();
        System.out.println("tempo gasto: "+(fim-inicio)+"ms");

        inicio = System.currentTimeMillis();
        concatStringBuffer(130_000);
        fim = System.currentTimeMillis();
        System.out.println("tempo gasto: "+(fim-inicio)+"ms");

    }
    private static void concatString(int tam){
        String txt = "";
        for(int i = 0; i<tam; i++){
            txt += i;
        }
    }
    private static void concatStringBuilder(int tam){
        StringBuilder sb = new StringBuilder(tam);
        for(int i = 0; i<tam; i++){
            sb.append(i);
        }
    }
    private static void concatStringBuffer(int tam){
        //para ambientes com multi threads
        StringBuffer sb = new StringBuffer(tam);
        for(int i = 0; i<tam; i++){
            sb.append(i);
        }
    }

}
