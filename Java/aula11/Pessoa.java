package Java.aula11;

public abstract class Pessoa {
    protected  String nome;
    protected  int idade;
    protected  String sexo;

    public void fazerAniversário(){
        setIdade(getIdade()+1);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString(){
        return "Pessoa{ nome = " + nome + ", idade = " + idade + 
        ", sexo = " + sexo;
    }
}
