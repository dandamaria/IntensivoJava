package academy.devdojo.revisao.dominio;

public class Livro {
    private String titulo, autor;
    private boolean emprestado;
    private static int[] paginas;


    public Livro(){
        for(int i:paginas){
            System.out.print("página "+ i+" - ");
        }
    }


    static{
        System.out.println("Dentro de static Livro");
        paginas = new int[5];
        for (int i =0 ; i<paginas.length; i++){
            paginas[i] = i+1;
        }
    }



    public Livro(String titulo, String autor, boolean emprestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.emprestado = emprestado;
    }

    public void emprestar(){
        emprestado = true;
    }

    public void devolver(){
        emprestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }
}
