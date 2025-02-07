package Java.aula03;

public class Caneta {
    public String modelo;
    public String cor;
    public float ponta;
    protected int carga;
    private boolean tampada;

    public void status(){
        System.out.println("\nModelo: " + this.modelo);
        System.out.println("Cor da Caneta: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }

    public void rabiscar(){
        if(this.tampada == true){
            System.out.println("Erro! Não posso rabiscar com a caneta tampada!");
        } else{
            System.out.println("Estou rabiscando!");
        }

    }

    public void tampar(){
        this.tampada = true; //this é o nome do objeto que chamou,
    }                          //como foi c1, this=c1, e assim por diante

    public void destampar(){
        this.tampada = false;
    }
}
