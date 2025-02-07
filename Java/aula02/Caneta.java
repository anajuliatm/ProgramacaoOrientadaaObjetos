package Java.aula02;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status(){
        System.out.println("\nModelo: " + this.modelo);
        System.out.println("Cor da Caneta: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }

    void rabiscar(){
        if(this.tampada == true){
            System.out.println("Erro! Não posso rabiscar com a caneta tampada!");
        } else{
            System.out.println("Estou rabiscando!");
        }

    }

    void tampar(){
        this.tampada = true; //this é o nome do objeto que chamou,
    }                          //como foi c1, this=c1, e assim por diante

    void destampar(){
        this.tampada = false;
    }
}
