package academy.devdojo.javacore.Oexception.exception.test;

import academy.devdojo.javacore.Oexception.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest {
    public static void main(String[] args) {
        try{
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }

    }

    private static void logar() throws LoginInvalidoException{
        Scanner teclado = new Scanner(System.in);
        String usernameDB = "Sakura";
        String senhaDB = "ssj";

        System.out.println("ditiga o usuário: ");
        String usernameDigitado = teclado.nextLine();
        System.out.println("digita a senha: ");
        String senhaDigitada = teclado.nextLine();

        if(!usernameDB.equals(usernameDigitado) || !senhaDB.equals(senhaDigitada)){
            throw new LoginInvalidoException("usuário ou senha inválidos");
        }
        System.out.println("Usuário logado com sucesso");
    }
}
