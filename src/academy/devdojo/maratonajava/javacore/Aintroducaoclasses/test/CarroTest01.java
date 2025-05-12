package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome="Honda Civic";
        carro1.modelo="City";
        carro1.ano= 2025;

        carro2.nome= "Ford Fiesta";
        carro2.modelo= "Sedan";
        carro2.ano= 2024;

        System.out.println("Nome: "+carro1.nome+"\nModelo:  "+ carro1.modelo+"\nAno: " + carro1.ano+" \n");
        System.out.println("Nome: "+carro2.nome+"\nModelo:  "+ carro2.modelo+"\nAno: " + carro2.ano);


    }
}
