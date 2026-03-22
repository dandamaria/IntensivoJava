package academy.devdojo.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest3 {
    public static void main(String[] args) {
        abreConexao();
    }

    private static String abreConexao() {
        try {
            System.out.println("abrindo arquivo");
            throw new RuntimeException();
//            System.out.println("fechando arquivo liberado pelo SO");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("fechando arquivo liberado pelo SO");

        }
        return null;

    }
}
