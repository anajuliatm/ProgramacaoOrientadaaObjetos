package Java.aula06;

public class ControleRemoto implements Controlador{
    //atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    //metodos especiais
    public ControleRemoto(){ //construtor
        this.volume = 50;   // da as instruções iniciais, como os atributos devem ser iniciados
        this.ligado = false;
        this.tocando = false;
    }

    private int getVolume() {
        return volume;
    }

    void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado(){
        return ligado;
    }

    private void setLigado(boolean lig){
        this.ligado = lig;
    }

    private boolean getTocando(){
        return tocando;
    }

    private void setTocando(boolean toc){
        this.tocando = toc;
    }


    //metodos abstratos criados automaticamente!!! uauuuu
    @Override //sobrescevendo o metodo q ja existe, pra poder programa-lo
    public void ligar() {
        this.setLigado(true);//liga
    }

    @Override
    public void desligar() {
        this.setLigado(false);//desliga
    }

    @Override
    public void abrirMenu() {
        System.out.println("Esta ligado? " + this.getLigado());
        System.out.println("Esta tocando? " + this.getTocando());
        System.out.print(" Volume: "+ this.getVolume());
        for (int i=0; i<=this.getVolume(); i+=10)
            System.out.print("|");
    }

    @Override
    public void fecharMenu() {
        System.out.println("\nFechando menu...");
    }

    @Override
    public void maisVolume() {
        if(this.getLigado())//se = true
            this.setVolume(this.getVolume() + 1);
    }

    @Override
    public void menosVolume() {
        if(this.getLigado())//se = true
            this.setVolume(this.getVolume() - 1);
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado() && this.getVolume() > 0)
            this.setVolume(0);
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() && getVolume() == 0)
            this.setVolume(50);
    }

    @Override
    public void play() {
        if(this.getLigado() && !(this.getTocando()))//só da play se ligado=true e tocando=false
            this.setTocando(true);
    }

    @Override
    public void pause() {
        if(this.getLigado() && this.getTocando()) //só da pause se ligado=true e tocando=true
            this.setTocando(false);
    }

}
