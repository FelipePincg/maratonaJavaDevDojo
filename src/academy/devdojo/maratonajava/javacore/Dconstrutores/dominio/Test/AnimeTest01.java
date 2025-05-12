package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Test;

import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        //sobrecarga de construtores.
        Anime anime = new Anime("Haikyuu","TV",12,"Ação","MadHouse");
      //  anime.init("Akudama drive","TV",12,"Ação");
        anime.imprime();
        System.out.println();
    }
}
