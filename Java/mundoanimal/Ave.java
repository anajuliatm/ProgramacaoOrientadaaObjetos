package Java.mundoanimal;

public class Ave extends Animal{
    private String corPena;

    @Override
    public void locomover(){
        System.out.println("Voando");
    }

    @Override
    public void alimentar(){    
        System.out.println("Frutas");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Piu Piu");
    }

    public void fazerNinho(){
        System.out.println("Construindo ninho");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
}
