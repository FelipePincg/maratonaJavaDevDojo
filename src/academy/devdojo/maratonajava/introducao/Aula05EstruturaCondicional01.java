package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturaCondicional01 {
    public static void main(String[] args) {
        int idade =15;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if (isAutorizadoComprarBebida) {

            System.out.println("Autorizado a comprar bebida alcólica");
        }else {
            System.out.println("Não autorizo a comprar bebida alcólica");
        }
        if(!isAutorizadoComprarBebida){
            System.out.println("Não autorizo a comprar bebida alcólica");
        }
        System.out.println("Fora do if");
        boolean c =false;
        if(c =true ){
            System.out.println("Dentro de algo nunca deveria ser feito");
        }
    }
}
