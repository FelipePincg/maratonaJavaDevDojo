package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturaCondicional06 {
    public static void main(String[] args) {
        // Dados os valores de 1 a 7 , imprima se é dia util   ou final de semana
        // considerando  1 como  domingo
        byte dia = 6;
        switch (dia) {
            case 1:
                System.out.println("Final de semana");
                break;
            case 2:
                System.out.println("Dia de semana");
                break;
            case 3:
                System.out.println("Dia de semana");
                break;
            case 4:
                System.out.println("Dia de semana");
                break;
            case 5:
                System.out.println("Dia de semana");
                break;
            case 6:
                System.out.println("Dia de semana");
                break;
            case 7:
                System.out.println("Final de semana");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
