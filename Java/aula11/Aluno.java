package Java.aula11;

public class Aluno extends Pessoa {
    private int matricula;
    private String curso;
    private boolean situacao;

    public Aluno(){
        this.situacao = true;
    }

    public void pagarMensalidade(){
        System.out.println("Pagando mens. do "+getNome());
    }

    public void cancelarMat(){
        setSituacao(false);
        System.out.println("Matricula cancelada");
    }

    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public boolean isSituacao() {
        return this.situacao;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }
}
