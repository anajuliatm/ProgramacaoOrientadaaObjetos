package Java.videoacess;

public class VideoAcess {
    public static void main(String[] args) {
        Video v[] = new Video[2];
        Assinante p = new Assinante("Ana Julia", 22, "F", "naninha");

        v[0] = new Video("IDGAF - Dua Lipa");
        v[1] = new Video("Bed Chem - Sabrina Carpenter");

        Visualizacao view[] = new Visualizacao[2];
        view[0] = new Visualizacao(p, v[0]);
        view[1] = new Visualizacao(p, v[1]);
        
        view[0].avaliar();
        view[1].avaliar(35.0f);
        
        System.out.println(view[0].toString());
        System.out.println("------------------");
        System.out.println(view[1].toString());
        
        /*System.out.println(v[0].toString());
        System.out.println(p.toString());*/
    }
}
