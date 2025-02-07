package Java.projetopessoas;

public class ProjetoPessoas {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Gabriel");
        p2.setNome("Cristina");
        p3.setNome("Carolina");
        p4.setNome("Wagner");

        p1.setSexo("M");
        p2.setSexo("F");
        p3.setSexo("F");
        p4.setSexo("M");

        p1.setIdade(22);
        p2.setIdade(57);
        p3.setIdade(26);
        p4.setIdade(47);

        p2.setCurso("Teologgia");
        p3.setEspecialidade("Cultivo Celular");
        p4.setSetor("Logística");

        p3.setSalario(5500.25f);
        p3.receberAumento(421.17f);
        p4.mudarTrabalho();
        p2.cancelarMat();

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}

