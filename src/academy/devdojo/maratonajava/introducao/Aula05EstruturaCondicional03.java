package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturaCondicional03 {
    public static void main(String[] args) {
        double salario =6000;
        //String resultado = (condicao)? verdadeiro :falso; Operador ternario
        String resultado = salario >5000 ? "Eu vou doar 500 pro DevDojo":"Ainda não tenho condições, mas vou ter";

        System.out.println(resultado);
    }
}
