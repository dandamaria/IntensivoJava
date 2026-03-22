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
            e.printStackTrace();
        }

    }

    private static void talvezLanceException() throws SQLException, FileNotFoundException{

    }
}
