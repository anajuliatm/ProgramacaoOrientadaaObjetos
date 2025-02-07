package Java.ultraemojicombat;

public class UltraEmojiCombat {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[5];
        l[0] = new Lutador("Marretinha", "Brasileiro", 27, 1.73f, 75.8f, 8, 3, 2);
        l[1] = new Lutador("Poatã", "Brasileiro", 32, 1.85f, 65.8f, 12, 2, 1);
        
        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[0], l[1]);
        UEC01.lutar();
        l[0].status();
        l[1].status();
    }

}
