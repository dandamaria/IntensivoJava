package academy.devdojo.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTest4 {
    public static void main(String[] args) {
        try{
            throw new RuntimeException();
        }catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException  e){
            System.out.println("dentro do ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException ");
        } catch (RuntimeException e) {
            System.out.println("Dentro do RuntimeException");
        }

        try {
            talvezLanceException();
        }catch (SQLException | FileNotFoundException e){
            //isso só pode ser feito porque essas Exceptions não tão na mesma linha de herança
        }

        //um exemplo onde as tem exceções na mesma linha de herança:
        try{
            talvezLanceException2();
        } catch (SQLException | IndexOutOfBoundsException e) {
            throw new RuntimeException(e);
        }/* catch (ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException(e);
            //ISSO AQUI NÃO FUNCIONA porque ArrayIndexOut.. faz parte de IndexOutOfBounds..
        }*/

    }

    private static void talvezLanceException() throws SQLException, FileNotFoundException{

    }

    private static void talvezLanceException2() throws ArrayIndexOutOfBoundsException, IndexOutOfBoundsException, SQLException{

    }


}
