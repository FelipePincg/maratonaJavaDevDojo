package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaDeRepeticao04 {
    public static void main(String[] args) {
        // Dado o valor de um carro descubra quantas vezes ele pode ser parcelado.
        //Condição valorParcela >=1000
        double valorCarro = 0;
        double valorParcela = 0;
        valorCarro = 30000;

        for (int parcela = 1; parcela < valorCarro; parcela++) {
            valorParcela = valorCarro / parcela;
            if (valorParcela < 1000) {
               break;
            }

            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }
    }
}
