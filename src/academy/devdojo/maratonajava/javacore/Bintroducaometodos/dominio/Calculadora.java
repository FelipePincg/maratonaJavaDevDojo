package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;


public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtrairDoisNumeros() {
        System.out.println(10 - 10);
    }

    //no maximo 3 parametros em sua função acima disso divida em metodos menores
    public void multiplicaDoisNumeros(int number1, float number2) {
        System.out.println(number1 * number2);
    }

    public double divideDoisNumeros(double num1, double num2) {
        //verificação sobre divisão por zero de num 2
        if (num2 != 0) {
            return num1 / num2;
        } else return 0;
    }

    public double divideDoisNumeros02(double num1, double num2) {
        //verificação sobre divisão por zero de num 2
        if (num2 == 0) {
            return 0;
        } else
            return num1 / num2;
    }

    public void imprimiDivisaoDeDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Não existe divisão por zero");
            //break do metodo void.
            return;
        }
        System.out.println(num1 / num2);
    }

    public void alteraDoisNumeros(int numero1, int numero2) {
        numero1 = 99;
        numero2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num1 " + numero1);
        System.out.println("Num2 " + numero2);

    }

    public void somaArray(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;

        }
        System.out.println(soma);
    }
    public void somaVarArgs(int...numeros){
        int soma = 0;
        for (int num : numeros) {
            soma += num;

        }
        System.out.println(soma);
    }

}
