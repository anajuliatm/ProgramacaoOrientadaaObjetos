package Java.aula03;

public class Aula02 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta(); //instanciando objetos
        c1.modelo = "BIC Cristal";
        c1.cor = "Azul";
        //c1.ponta = 0.5f;
        c1.carga = 80;
        c1.status();
        c1.destampar();
        c1.rabiscar();
    }
}
