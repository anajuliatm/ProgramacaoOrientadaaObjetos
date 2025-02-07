package Java.exercitando;

public class LivingRoom {
    public static void main(String[] args) {
        
        System.out.println("\nEstamos na minha sala de estar!\n\n");
        
        Televisao t1 = new Televisao();
        t1.cor = "Preta";
        t1.definicao = "4k";
        t1.estado = false;
        t1.marca = "Samsung";
        t1.polegadas = 40;

        t1.status();
        t1.navegar();
    }
}
