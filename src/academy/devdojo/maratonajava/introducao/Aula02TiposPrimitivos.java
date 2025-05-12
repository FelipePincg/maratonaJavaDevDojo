package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String []args){
        //psvm
        //tipos primitivos aqui em baixo
        // int , double,float, char, byte,short,long,boolean
        //idade valor guardado em memoria

        int age = (int)10000000000L;
        long  numeroGrande = (long)155.53;
        double salarioDouble  = 2000;
        float salarioFloat = 2500;
        byte idadeByte = -128; // range -127 - 128
        short idadeShort = 10;
        boolean verdaedeiro = true;
        boolean falso  = false;
        char  caractere ='\u0041';



        String nome = "Goku";
        System.out.println("Oi meu nome é "+nome);
        System.out.println("A idade é "+ age+" anos");
        System.out.println(falso);
        System.out.println("char "+caractere);
        System.out.println(numeroGrande);





    }
}

