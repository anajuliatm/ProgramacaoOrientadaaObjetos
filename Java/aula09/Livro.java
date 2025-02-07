package Java.aula09;
public class Livro implements Publicacao{
    //Atributos
    private String titulo;
    private String autor;
    private int totpaginas;
    private int pagatual;
    private boolean aberto;
    private Pessoa leitor;

    //Metodos Publicos    
    public Livro(String ti, String au, int tt, Pessoa le){//construtor
        this.pagatual = 0; //inicia o livro na pagina 0
        this.aberto = false; //inicia o livro fechado

        this.titulo = ti;
        this.autor = au;
        this.totpaginas = tt;
        this.leitor = le;
    }

    public void detalhes(){
        System.out.println("\n\n***LIVRO***");
        System.out.println("Leitor: "+ this.leitor.getNome());
        System.out.println("Idade do Leitor: "+ this.leitor.getIdade());
        System.out.println("Título: "+ getTitulo());
        System.out.println("Autor: "+ getAutor());
        System.out.println("QTD de Pág: "+ getTotpaginas());
        System.out.println("Pág. Atual: "+ getPagatual());
        System.out.println("O livro está aberto? "+ isAberto());
    }

    //Metodos Abstratos
    @SuppressWarnings("override")
    public void abrir(){
        setAberto(true);
    }
    @SuppressWarnings("override")
    public void fechar(){
        setAberto(false);
    }
    @SuppressWarnings("override")
    public void folhear(){
        if(isAberto()){
            for(int i=0; i< getTotpaginas(); i+=5){
                setPagatual(getPagatual()+3);
                System.out.print(" > ");
            }
        }else{
            System.out.println("---> Não é possível folhear, o livro está fechado!");
        }
    }
    @SuppressWarnings("override")
    public void avancarPag(){
        if(isAberto()){
            setPagatual(getPagatual()+1);
            System.out.println("Você está na página "+getPagatual());
        }else{
            System.out.println("-> Ñ é possível avançar página com o livro fechado!");
        }
    }
    @SuppressWarnings("override")
    public void voltarPag(){
        if(isAberto()){
            setPagatual(getPagatual()-1);
            System.out.println("Você está na página "+getPagatual());
        }else{
            System.out.println("-> Ñ é possível recuar página com o livro fechado!");
        }
    }

    //Metodos Especiais
    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotpaginas() {
        return this.totpaginas;
    }

    public void setTotpaginas(int totpaginas) {
        this.totpaginas = totpaginas;
    }

    public int getPagatual() {
        return this.pagatual;
    }

    public void setPagatual(int pagatual) {
        this.pagatual = pagatual;
    }

    public boolean isAberto() {
        return this.aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        System.out.println("\n\nSOBRE O LEITOR:");
        System.out.println("Nome: "+leitor.getNome());
        System.out.println("Idade: "+leitor.getIdade());
        System.out.println("Sexo: "+leitor.getSexo());
        return this.leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
}
