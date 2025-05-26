package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogado1 = new Jogador("Pelé");
        jogado1.imprime();
        Time time1 =  new Time("Seleção Brasileira");

        jogado1.setTime(time1);
        System.out.println("--------------");
        jogado1.imprime();

    }
}
