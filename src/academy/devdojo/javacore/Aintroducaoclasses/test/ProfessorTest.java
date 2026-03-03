package academy.devdojo.javacore.Aintroducaoclasses.test;

import academy.devdojo.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.name = "Mestre Enki";
        professor.age = 45;
        professor.sex = 'M';

        System.out.println(professor.name + " " + professor.age + " " + professor.sex);
    }
}
