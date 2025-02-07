package Java.exercitando;

public class Televisao {
    String marca;
    int polegadas;
    String cor;
    String definicao;
    boolean estado;

    void status(){
        System.out.println("\n-----TELEVISAO-----");
        System.out.println("Marca: " + this.marca);
        System.out.println("Polegadas: "+ this.polegadas);
        System.out.println("Cor: "+this.cor);
        System.out.println("Definicao: "+this.definicao);
        System.out.println("Esta ligada? "+this.estado);
    }

    void navegar(){
        if(this.estado == false)
            System.out.println("Nao é possivel navegar pelos canais com a TV desligada!");
        else
            System.out.println("Estou procurando canais!");
    }

    void ligar(){
        this.estado = true;
    }

    void desligar(){
        this.estado = false;
    }
}
