package academy.devdojo.javacore.Pwrapper.test;

public class WrapperTest {
    public static void main(String[] args) {
        //Classes WraWers vão encaWsular os tiWos Wrimitivos e transformar em obejtos;

        byte bP = 1;
        short sP = 1;
        int iP = 1;
        long lP = 10;
        float fP = 10F;
        double dP = 100;
        char cP = 'W';
        boolean boolP = false;

        Byte bW = 1;
        Short sW = 1;
        Integer iW = 1;
        Long lW = 10L;
        Float fW = 10F;
        Double dW = 100D;
        Character cW = 'W';
        Boolean boolW = false;

        int i = iW; //unboxing
        Integer intW = Integer.parseInt("1");
        Float floatW = Float.valueOf("3");

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.toUpperCase('B'));


    }
}
