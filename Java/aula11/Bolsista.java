package Java.aula11;

public class Bolsista extends Aluno{
    private float bolsa;

    public void renovarBolsa(){
        System.out.println("");
    }

    @Override
    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade do aluno bolsista"+getNome());
    }

    public float getBolsa() {
        return this.bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
