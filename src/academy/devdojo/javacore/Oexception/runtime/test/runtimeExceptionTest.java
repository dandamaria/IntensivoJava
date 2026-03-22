package academy.devdojo.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest {
    public static void main(String[] args) {
        // Checked e Unchecked
        Object object = null;

        int[] array = {1,2};
        System.out.println(array[2]);
        System.out.println(object.toString());
    }
}
