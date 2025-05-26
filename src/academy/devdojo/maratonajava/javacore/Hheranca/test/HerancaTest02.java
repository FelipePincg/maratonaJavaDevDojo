package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerancaTest02 {
    // 0 Bloco de inicialização estático da super classe é executado quando a jvm carregar  classe pai
    // 1 Bloco de inicialização estático das sub classe é executado quando a JVM carregar classe filha
    // 2 Alocado espaci em memorio do obejto da superclasse
    // 3 Bloco de  inicialização  é executado
    // 4 Construtor é executado.
    // 5 Construtor  é executado mem memória pro objeto da super classe
    // 6 Alocado espaco em memória objeto da subclasse
    // 7  Cada atributo de subclasse é criado e inicializado com valores default
    // 8 Bloco de inicialização da subclasse é executado na ordem em que aparece
    // 9 construtor é executado da subclasse

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Jiraya");

    }
}
