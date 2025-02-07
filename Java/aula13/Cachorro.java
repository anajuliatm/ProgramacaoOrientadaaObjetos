package Java.aula13;

public class Cachorro extends Lobo{
    @Override
    public void emitirSom(){
       System.out.println("\nAu Au Au\n"); 
    }

    @SuppressWarnings("StringEquality")
    public void reagir(String frase){
        if(frase == "Toma comida" || frase == "Olá"){
            System.out.println("Abanar e Latir");
        }else{
            System.out.println("Rosnar");
        }
    }

    public void reagir(int hora, int min){
        if(hora < 12)
            System.out.println("Abanar");
        else if(hora >= 18)
            System.out.println("Ignorar");
        else
            System.out.println("Abanar e Latir");
    }

    public void reagir(boolean dono){
        if(dono)
            System.out.println("Abanar");
        else
            System.out.println("Rosnar");
    }
    /*
     * As diferentes assinaturas nas classes permite
     * que a mesma classe possa ser chamada e retorne]
     * diferentes possibilidades!
     */
}
