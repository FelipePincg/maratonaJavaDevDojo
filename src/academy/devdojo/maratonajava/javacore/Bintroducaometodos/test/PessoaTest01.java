package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;


public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        //pessoa.name = "Jiraya";
       // pessoa.age = 70;
        pessoa.setName("Jiraya");
        pessoa.setAge(70);

        System.out.println(pessoa.getName());
        System.out.println(pessoa.getAge());
    }
}
