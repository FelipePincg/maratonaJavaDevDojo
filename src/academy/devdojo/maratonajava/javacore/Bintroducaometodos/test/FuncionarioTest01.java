package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
       // double[] salario = {1518,2200,4000};
        Funcionario funcionario = new Funcionario();


        funcionario.setSalarios(new double[]{1200,981.32,2000});
        funcionario.imprimeFuncionario();
        System.out.println();
        funcionario.mediaSalario();

    }
}
