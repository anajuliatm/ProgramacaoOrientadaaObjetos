package Java.aula11;

public class Aula11 {
    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa();
        // --> Nesse caso, a Classe Pessoa é
        // abstrata, ent não pode ser instanciada
        Visitante v1 = new Visitante();
        v1.setNome("Julio");
        v1.setIdade(25);
        v1.setSexo("M");
        System.out.println(v1.toString());
        Aluno a1 = new Aluno();
        a1.setNome("Eduardo");
        a1.setMatricula(1111);
        a1.setIdade(30);
        a1.setSexo("M");
        Bolsista b1 = new Bolsista();
        b1.setMatricula(125);
        b1.setNome("Clelia");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();
    }

}
    
