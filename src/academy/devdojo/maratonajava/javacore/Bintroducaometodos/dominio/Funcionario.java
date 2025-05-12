package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

import javax.xml.parsers.SAXParser;

public class Funcionario {
    private String name;
    private int age;
    private double[] salarios;
    private double media = 0;

//    public void setMedia(double media) {
//        this.media = media;
//    }

    public double getMedia() {
        return media;
    }

    public void imprimeFuncionario() {
        System.out.println(this.name);
        System.out.println(this.age);
        if (salarios == null) {
            return;
        }
        for (int i = 0; i < salarios.length; i++) {
            System.out.print("Salário " + i + " " + salarios[i] + ";\n");
        }
        mediaSalario();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void mediaSalario() {
        if (salarios == null) {
            return;
        }
        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;

        System.out.println("Média dos Salarios: " + media);
    }
}
