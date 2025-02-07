package Java.aula05;

public class Aula05 {
    public static void main(String[] args) {
        ContaBanco pessoa1 = new ContaBanco();
        pessoa1.setNumConta(1111);
        pessoa1.setDono("Gabriel Vilela");
        pessoa1.abrirConta("cc");

        ContaBanco pessoa2 = new ContaBanco();
        pessoa2.setNumConta(2222);
        pessoa2.setDono("Ana Julia");
        pessoa2.abrirConta("cp");

        pessoa1.depositar(2500);
        pessoa2.depositar(1985);
        pessoa2.sacar(125);
        pessoa1.fecharConta();

        pessoa1.estadoAtual();
        System.out.println("-------");
        pessoa2.estadoAtual();
    }
}
