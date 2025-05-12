package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        //while do while , for
        //valor booleano dentro do while

        int count = 9;
//        while (count < 10) {
//            ++count;
//            System.out.println("Posição atual: " + count);
//
//        }

        do
            System.out.println("Dentro do  do-while" + ++count  );
        while(count<10);

        for (int i =0;i < 10;i++){
            System.out.println("For "+i);
        }


    }
}
