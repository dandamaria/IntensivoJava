package academy.devdojo.javacore.BintroducaoMetodos.dominio;

public class Funcionario {
    private String name;
    private int age;
    private float[] salary;
    private double media;

    public void imprimeDados() {
        System.out.println(this.name);
        System.out.println(this.age);
        mediaSalario();
    }

    public void mediaSalario() {
        float media = 0;
        if (salary != null)
            for (float pos : salary) {
                media += pos;
                media /= salary.length;
            }
        System.out.printf("média salarial é %.2f%n", media);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(float[] salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float[] getSalary() {
        return salary;
    }

    public double getMedia() {
        return media;
    }
}

