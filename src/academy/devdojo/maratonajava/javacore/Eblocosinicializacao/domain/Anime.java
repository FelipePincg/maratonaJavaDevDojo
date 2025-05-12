package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.domain;

public class Anime {
    private String nome;
    private int[] episodios = {1,2,3,4,5,6,7,8,9,10,11,12};
    //Alocando espçao na memoria
    //Cada atributo de classe é inicializado com valores default ou o quer for passada
    // Bloco de inicialização é executado
    // Construtor é executado

    {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i=0;i<episodios.length;i++){
            episodios[i]=i+1;
        }

    }
    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {

        for (int episodio: episodios){
            System.out.print(episodio+" ");
        }
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
