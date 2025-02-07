package Java.aula04;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    //protected int carga;
    private boolean tampada;

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Caneta(String m, String c, float p) {
        this.modelo = m;
        this.cor = c;
        this.setPonta(p);
        this.tampar();
    }


    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String m){
        this.modelo = m;
    }

    public float getPonta(){
        return this.ponta;
    }

    public void setPonta(float p){
        this.ponta = p;
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }

    public void status(){
        System.out.println("SOBRE A CANETA");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.cor);
        System.out.println("Está tampada? " + this.tampada);
    }
/*
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
    }*/
}
