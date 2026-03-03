package academy.devdojo.javacore.Gassociacao.exercicioSeminario;

public class Main {

    public static void main(String[] args) {

        Local localTeatro = new Local("Laranjeiras", 82, "Monte", 658223);

        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno("Joao", 19);
        Aluno aluno3 = new Aluno("Pedraria", 21);

        Professor pro = new Professor("alberto", "geografia");
        Professor professor2 = new Professor("Historia", "Joaquina");
        Professor prof = new Professor();

        Aluno[] alunosSeminario1 = {aluno1, aluno2};
        Aluno[] alunosSeminarioRio = {aluno1, aluno3};

        Seminario seminario = new Seminario("Machine Learning", localTeatro, alunosSeminario1);
        Seminario seminarioRio = new Seminario("Quebrando Tudo", localTeatro, alunosSeminarioRio);

        Seminario[] disponiveis = {seminarioRio, seminario};
        Seminario[] Rio = {seminarioRio};

        pro.setNome("Pa");
        prof.setNome("Ju");
        prof.setEspecialidade("Crochê");

        professor2.setSeminarios(disponiveis);
        prof.setSeminarios(disponiveis);
        pro.setSeminarios(Rio);

        seminarioRio.imprime();

        Aluno um = new Aluno("Pedro", 30);
        Aluno dois = new Aluno("João", 19);
        Aluno tres = new Aluno("Maria", 20);

        Aluno[] estudantesRio = {aluno1,um,dois,tres,aluno2};
        seminarioRio.setEstudantes(estudantesRio);

        seminarioRio.imprime();
        prof.imprime();

    }
}
