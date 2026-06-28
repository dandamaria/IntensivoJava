package academy.devdojo.revisao.RevisaoExceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchExample {
    public static void main(String[] args) {

        try(Scanner input = new Scanner(System.in);){
            System.out.println("enter a number: ");
            int n = input.nextInt();
            System.out.println(n);
        }catch (ArithmeticException e){
            //ao invés de interromper o programa ele mostra algo personalizado:
            System.out.println("you can't divide by zero!");
        }catch(InputMismatchException e){
            //caso o usuário digite uma string ao invés de um número
            System.out.println("that wasn't a number!");
        }catch (Exception e){
            //uma forma mais genérica - para caso não encontre o erro específico
            System.out.println("algo deu errado");
        }
        finally {
            //o que tiver no finally sempre vai acontecer
            //frequentemente usado pra limpeza, como: input.close();
            /*OBS: se colocar a ação dentro dos parênteses de try() então não precisa fechar, nesse exemplo, não é preciso
            colocar "input.close()" porque ele fecha automaticamente o input já que esse input.nextInt() tá dentro do 'try';
             */
            System.out.println("sempre vai acontecer o que tiver aqui");
        }
    }
}
