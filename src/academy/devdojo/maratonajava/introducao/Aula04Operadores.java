package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 / (double) numero02;
        System.out.printf("%d%n", numero01 + numero02);
        System.out.println(numero01 + numero02 + "Valor: " + numero01 + numero02);
        //% resto da divisão
        int resto = 20 % 2;
        System.out.println(resto);
        //<> <= >=  == != !
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 > 20;
        boolean isDezIgualQueVinte = 10 == 20;
        boolean isDezIgualQueDez = 10 == 10;
        boolean isDezDiferenteVinte = 10 != 20;


        System.out.println("isDezMaiorQueVinte : " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte : " + isDezMenorQueVinte);
        System.out.println("isDezIgualQueVinte : " + isDezIgualQueVinte);
        System.out.println("isDezIgualQueDez : " + isDezIgualQueDez);
        System.out.println("isDezDiferenteVinte : " + isDezDiferenteVinte);

        //&& (AND) || (OR) !(Negação)
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println(isDentroDaLeiMaiorQueTrinta);
        System.out.println(isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double ValorTotalContaPoupanca = 10000;
        double valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || ValorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel " + isPlaystationCincoCompravel);

        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000; // 2800
        bonus -= 1000;//1800
        bonus *= 2;
        bonus /= 2;
        System.out.println(bonus);
        //
        int contador = 0;
        contador++;
        System.out.println(contador);

        contador--;

        System.out.println(contador);

        --contador;
        System.out.println(contador);

        ++contador;
        System.out.println(contador);
        int contador2 =0;
        System.out.println(contador2++);


    }
}
