package academy.devdojo.revisao.RevisaoExceptions;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class MultiplasExceptions {
    //exemplo: uma requisição HTTP tem vários status e dependendo desse status você pode querer tratar esses erros de diferentes formas;
    //e como se faz isso? utiliza múltiplos catchs

    public static void main(String[] args) {
        try{
            //lançando uma exceção a nível de teste:
            throw new ArrayIndexOutOfBoundsException();
            //depois que executa o JAVA vai procurar qual daz exceções ele consegue fazer a associação
        } catch(IllegalArgumentException e){
            System.out.println("dentro de IllegalArgumentException");
        }catch (ArithmeticException e){
            System.out.println("dentro de ArithmeticException");
        }catch(IndexOutOfBoundsException e) {
            System.out.println("dentro de IndexOutOfBoundsException");
        }

        //e se ele não achar nenhum catch funcional pra exceção?
        try {
            System.out.println(10 / 0);
        }catch(IllegalArgumentException e){
            System.out.println("dentro de IllegalArgumentException");
        }catch(IndexOutOfBoundsException e) {
            System.out.println("dentro de IndexOutOfBoundsException");
        } catch (RuntimeException e) {
            /*
            esse sempre fica por último porque é o mais genérico e todas os outros 'Exceptions' são filhos desse, porque
            senão a referência sempre vai ser pra ele
            */
            System.out.println("dentro do tipo mais genérico de catch");
        }

        //vou chamar a função LancaException então vou precisar tratar ela:
        try{
            LancaException();
        } catch (SQLException e) {
            System.out.println("tratando a primeira possível exceção");
        } catch (FileNotFoundException e){
            System.out.println("tratando a outra exceção");
        }

    }

    private static void LancaException() throws SQLException, FileNotFoundException{

    }
}
