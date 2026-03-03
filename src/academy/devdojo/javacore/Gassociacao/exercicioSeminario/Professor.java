package academy.devdojo.javacore.Gassociacao.exercicioSeminario;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public Professor(String especialidade, String nome) {
        this.especialidade = especialidade;
        this.nome = nome;
    }

    public void imprime(){
        System.out.println("--------");
        System.out.println("Prof. "+this.nome);
        if(this.seminarios == null) return;
        System.out.println("# Seminário Cadastrados #");
        for(Seminario seminario : this.seminarios){
            System.out.println(seminario.getTitulo());
            if(seminario.getEstudantes() == null) continue;
            System.out.println("Alunos: ");
            for (Aluno aluno : seminario.getEstudantes()){
                System.out.println(aluno.getNome());
            }
        }
    }

    public Professor() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
