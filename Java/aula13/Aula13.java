package Java.aula13;

public class Aula13 {
    public static void main(String[] args) {
        //Animal x = new Animal(); n pode pq é classe abstrata
        Cachorro x = new Cachorro();

        x.emitirSom();
        x.reagir("Olá");
        x.reagir(true);
        x.reagir(12,30);
        //exemplo de polimorfismo de sobrecarga!
    }
}
