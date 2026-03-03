package academy.devdojo.intro.Exercios;

import java.util.Scanner;

public class AcessoAoLaboratorio {
    public static void main(String[] args) {
        /*
        Situação:
        Uma porta de laboratório só abre se:
        A pessoa tiver cartão de acesso AND souber a senha;
        OR se for um administrador (nesse caso, não precisa de cartão nem senha);
        BUT NOT se estiver na lista de bloqueio.
         */
        boolean temCartao;
        boolean sabeSenha;
        boolean adm;
        boolean listaBloqueio = false;

        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        Scanner entrada3 = new Scanner(System.in);
        Scanner entrada4 = new Scanner(System.in);


        System.out.println("Você é administrador? S/N");
        if(entrada.nextLine().equals("S")){
            adm = true;
        }else{
            adm = false;
        }

        System.out.println("Você tem o cartão de acesso? S/N");
        if(entrada2.nextLine().equals("S")){
            temCartao = true;
        }else{
            temCartao = false;
        }

        System.out.println("Você sabe a senha? S/N");
        if(entrada3.nextLine().equals("S")){
            sabeSenha = true;
        }else{
            sabeSenha = false;
        }

        String[] bloqueados = {"cuju","dodo","dudu","dojo"};

        System.out.println("Qual seu nome?");
        String nome = entrada4.nextLine();
        for (int i=0; i < 4; i++) {
            if(nome.equals(bloqueados[i])){
                listaBloqueio = true;
            }
        }

        if(((temCartao && sabeSenha) || adm) && !listaBloqueio){
            System.out.println("você tem acesso");
        }else{
            System.out.println("Você não tem acesso");
        }

    }
}
