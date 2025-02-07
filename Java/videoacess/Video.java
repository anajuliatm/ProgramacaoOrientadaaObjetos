package Java.videoacess;

public class Video implements AcoesVideo{
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    public Video(String titulo){
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    @Override
    public void play(){
        if(isReproduzindo())
            System.out.println("\nJá está reproduzindo!");
        else
            this.reproduzindo = true;
    }

    @Override
    public void pause(){
        if(!isReproduzindo())
            System.out.println("Já está pausado!");
        else
            this.reproduzindo = false;
    }

    @Override
    public void like(){
        setCurtidas(getCurtidas()+1);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        int novaAval;
        novaAval = (this.avaliacao + avaliacao) / this.views;
        this.avaliacao = novaAval;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public String toString(){
        return "VIDEO { Titulo = " + titulo + " Avaliação = " + avaliacao +
        " Views = " + views + " Curtidas = " + curtidas + 
        " Reproduzindo = " + reproduzindo + "}";
    }
}
