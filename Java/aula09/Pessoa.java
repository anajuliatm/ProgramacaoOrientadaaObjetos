package Java.aula09;

public class Pessoa {
    // Atributos
    private String nome;
    private int idade;
    private String sexo;

    //Métodos Públicos
    public void fazerAniver(){
        setIdade(getIdade()+1);
    }

    //Métodos Especiais
    public Pessoa(String no, int id, String se){
        this.nome = no;
        this.idade = id;
        this.sexo = se;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    
}
