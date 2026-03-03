package academy.devdojo.javacore.CsobrecargaMetodos.dominio;

public class CalculadoraExercicio {

    int soma;

    public int soma(int a,int b){
        return soma = a + b;
    }
    public int soma(int a, int b, int c){
        return soma = a+b+c;
    }
    public void soma(double d, double a){
        soma = (int)d + (int)a;
        System.out.println(soma);
    }



}
