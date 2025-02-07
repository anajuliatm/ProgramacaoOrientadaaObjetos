package Java.aula05;

public class ContaBanco {
    //atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //metodos personalizados
    @SuppressWarnings("StringEquality") //quickfix para nao dar warning com == ao inves de equal
    public void estadoAtual(){
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    @SuppressWarnings("StringEquality")
    public void abrirConta(String t){
        //this.numConta = num;
        this.setTipo(t);
        this.setStatus(true); 
        System.out.println("Conta aberta com sucesso");
        //this.dono = d;
        
        if(t == "cc")
            setSaldo(50);
        else if (t == "cp") 
            setSaldo(150);
    }

    public void fecharConta(){
        if(this.getSaldo() > 0)
            System.out.println("Conta com dinheiro, n eh possivel fechar conta");
        else if(this.getSaldo() < 0)
            System.out.println("Conta negativada, n eh possivel fechar");
        else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
            
    }

    public void depositar(float valor){
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Valor depositado:" + valor);
        }
        else{
            System.out.println("Conta desativada, nao eh possivel sacar");
        }
    }

    public void sacar(float valor){
        if(this.getStatus()){
            if(this.getSaldo() >= valor){
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque realizado com sucesso na conta de " + this.getDono());
            }
            else
                System.out.println("Saldo insuficiente");    
        }
        else
            System.out.println("Conta desativada");
    }

    @SuppressWarnings("StringEquality")
    public void pagarMensal(){
        float valMensalidade = 0;
        if(this.getTipo() == "cc")
            valMensalidade = 12;
        else if(this.getTipo() == "cp")
            valMensalidade = 20;
        
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() - valMensalidade);
            System.out.println("Mensalidade paga com sucesso");
        }
        else
            System.out.println("Conta desativada");   
                
    }

    //metodos especiais
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public ContaBanco(){ //METODO CONSTRUTOR
        this.setSaldo(0);
        this.setStatus(false);
        System.out.println("Construido com sucesso");
    }

    public void setNumConta(int num){
        this.numConta = num;
    }
    public int getNumConta(){return numConta;}
    
    public void setTipo(String t){
        this.tipo = t;
    }
    public String getTipo(){return this.tipo;}

    public void setDono(String d){
        this.dono = d;
    }
    public String getDono(){return this.dono;}

    public void setSaldo(float s){
        this.saldo = s;
    }
    public float getSaldo(){return this.saldo;}
    
    public void setStatus(boolean st){
        this.status = st;
    }
    public boolean getStatus(){return this.status;}
}
