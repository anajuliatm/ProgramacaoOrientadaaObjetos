package Java.videoacess;

public class Assinante extends Pessoa{
    private String login;
    private int totAssistido;

    public Assinante(String nome, int idade, String sexo, String login){
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {
        return "ASSINANTE { Login = " + login + ", Total Assistido = " + totAssistido +
        "} --> " + super.toString();
    }

}
