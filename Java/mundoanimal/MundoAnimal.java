package Java.mundoanimal;

public class MundoAnimal {
    public static void main(String[] args) {
        
        Mamifero cachorro = new Mamifero();
        Peixe beta =  new Peixe();
        //Reptil lagarto = new Reptil();
        //Ave bemtevi = new Ave();
        Canguru c = new Canguru(); // Classe filha de Mamifero

        cachorro.setPeso(55.4f);
        cachorro.setIdade(5);
        cachorro.setMembros(4);
        cachorro.setCorPelo("Marrom");
        //System.out.println(cachorro.toString());
        cachorro.emitirSom();

        beta.setPeso(0.5f);
        beta.setIdade(1);
        beta.setMembros(2);
        beta.soltarBolha();
        
        cachorro.locomover();
        beta.locomover();
        c.locomover(); //Sobrepoe o metodo locomover do mamifero, pois o Canguru pula
        /*Isso é a definição de Polmorfismo
         * de Sobreposição  */
    }
}
