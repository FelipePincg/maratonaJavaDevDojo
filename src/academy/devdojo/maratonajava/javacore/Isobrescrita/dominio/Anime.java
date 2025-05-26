package academy.devdojo.maratonajava.javacore.Isobrescrita.dominio;

public class Anime  extends  Object{
    private  String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "nome='" + nome + '\'' +
                '}';
    }

}
