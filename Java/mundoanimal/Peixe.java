package Java.mundoanimal;

public class Peixe extends Animal{
    private String corEscama;

    @Override
    public void locomover(){
        System.out.println("Nadando");
    }

    @Override
    public void alimentar(){
        System.out.println("Comendo substâncias");
    }

    @Override
    public void emitirSom(){
        System.out.println("Glub Glub");
    }

    public void soltarBolha(){
        System.out.println("º º º");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
