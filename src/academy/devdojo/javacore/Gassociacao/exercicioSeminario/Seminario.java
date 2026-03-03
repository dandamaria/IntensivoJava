package academy.devdojo.javacore.Gassociacao.exercicioSeminario;

import java.util.ArrayList;

public class Seminario {
    private String titulo;
    private Local local;
    private Aluno[] estudantes;
    private Professor professor;

    public Seminario(Local local) {
        this.local = local;
    }

    public Seminario(String titulo, Local local, Aluno[] estudantes, Professor professor) {
        this.titulo = titulo;
        this.local = local;
        this.estudantes = estudantes;
        this.professor = professor;
    }

    public Seminario(String titulo, Local local) {
        this.titulo = titulo;
        this.local = local;
    }

    public void imprime(){
        System.out.println("----------");
        System.out.println("Seminário "+ getTitulo());
        System.out.println("Local: "+local.getRua()+", "+local.getNumero()+", "+local.getBairro());
        if(this.estudantes != null) {
            System.out.println("alunos: ");
            for (Aluno aluno : this.estudantes) {
                System.out.println(aluno.getNome());
            }
        }
    }

    public Seminario(String titulo, Local local, Aluno[] estudantes) {
        this.titulo = titulo;
        this.local = local;
        this.estudantes = estudantes;
    }

    public Seminario(Aluno[] estudantes, Local local, String titulo) {
        this.estudantes = estudantes;
        this.local = local;
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Aluno[] getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(Aluno[] estudantes) {
        this.estudantes = estudantes;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
