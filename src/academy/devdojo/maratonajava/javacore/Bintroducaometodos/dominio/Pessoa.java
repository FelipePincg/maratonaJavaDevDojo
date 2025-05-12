package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Pessoa {
    //aclopamento quanto que uma classe conhece da outra
    private String name;
    private int age;

    public void imprime() {
        System.out.println(name);
        System.out.println(age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Idade inválida");
            return;
        }
        this.age = age;
    }

    public String getName() {
        return this.name;
    }
    public int getAge(){
        return this.age;
    }

}
