package Java.mundoanimal;

public class Reptil extends Animal{
    private String corEscama;

    @Override
    public void locomover(){
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar(){
        System.out.println("Vegetais");
    }

    @Override
    public void emitirSom(){
        System.out.println("SssSs");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

}
