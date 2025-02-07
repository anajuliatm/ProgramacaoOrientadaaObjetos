package Java.aula09;

public class Aula09 {
    public static void main(String[] args) {
        Pessoa ana = new Pessoa("Ana Julia", 22, "f");
        //Pessoa gabriel = new Pessoa("Gabriel", 22, "m");
        //Pessoa carol = new Pessoa("Carolina", 26, "f");

        Livro l1 = new Livro("Harry Potter", "JK Rowling", 30, ana);
        //Livro l2 = new Livro("Percy Jackson", "Rick Riordan", 20, carol);
        //Livro l3 = new Livro("It a Coisa", "Stephen King", 25, gabriel);

        l1.abrir();
        //l2.abrir();
        //l3.abrir();

        l1.detalhes();
        ana.fazerAniver();
        //l2.detalhes();
        //l3.detalhes();
        //l1.fechar();
        //l1.folhear();
        l1.detalhes();
    }
}
