package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Carro {

    private String nome;
    private double velocidadeMaxima;
    private static double  velocidadeLimite = 250;

public void imprime(){
    System.out.println("-------------------");
    System.out.printf("Nome:%s %n",this.nome);
    System.out.printf("Velocidade máxima:%s %n",this.velocidadeMaxima);
    System.out.printf("Velocidade limite:%s %n",Carro.velocidadeLimite);
}
    public String getNome() {
        return nome;
    }

    public Carro(String nome, double velocidadeMaxima, double velocidadeLimite) {
        this(nome,velocidadeMaxima);
        Carro.velocidadeLimite = velocidadeLimite;
    }


    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
    public static void setVelocidadeLimite(double velocidadeLimite){
        Carro.velocidadeLimite = velocidadeLimite;

    }

    public static  double getVelocidadeLimite(){
        return velocidadeLimite;
    }

}
