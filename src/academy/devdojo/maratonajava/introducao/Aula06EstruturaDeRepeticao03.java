package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaDeRepeticao03 {
    // imprima os primeiros 25 numeros de um dado valor
    public static void main(String[] args) {
        int valorMax = 50;
        for (int i = 0; i < valorMax; i++) {
            if (i > 25) {
                i=51;


            }
            System.out.println(i);

        }
    }
}