
package lista2pooex1;
public class CotaJoao {
        private String nome;
    private String endereco;
    private String cpf;
    private int rg;
    private String tip;
    private int numconta;
    private float saldo;
    private boolean status;
    //Métodos Personalisados
    public void estadoAtual(){
        System.out.println("--------------------------");
        System.out.println("Nome: "+this.getNome());
        System.out.println("Endereço: "+this.getEndereco());
        System.out.println("CPF: "+this.getCpf());
        System.out.println("RG: "+this.getRg());
        System.out.println("Tipo: "+this.getTip());
        System.out.println("Numero Conta: 555");
        System.out.println("Saldo: "+this.getSaldo());
        System.out.println("Status: "+this.getStatus());
        System.out.println("--------------------------");
}
    public void abrirConta(String t){
        this.setTip(t);
        this.getNome();
        this.getEndereco();
        this.getCpf();
        this.getRg();
        this.setStatus(true);
        if(t=="CC"){
            System.out.println("Conta Corrente Aberta com Sucesso");
        }else if(t=="CP"){
            System.out.println("Conta Poupança Aberta com Sucesso");
        }
    }
    public void fecharConta(){
        if (this.getSaldo()>0){
            System.out.println("A conta não pode fechar, AINDA HA DINHEIRO");
        }else if (this.getSaldo() <0){
            System.out.println("A conta não pode fechar, ESTÁ EM DÉBITO");
        }else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
        
    }
    
    public void depositar(float v){
        if(this.getStatus()){
            this.setSaldo(this.getSaldo()+v);
            System.out.println("Deposito Realizado com sucesso");
        }else{
            System.out.println("Não é possivel depositar am uma conta fechada");
        }
        
    }
    public void sacar(float v){
        if(this.getStatus()){
            if(this.getSaldo()>=v){
                this.setSaldo(this.getSaldo()-v);
                System.out.println("Saque Realizado com Sucesso");
            }else{
                System.out.println("Saque Insuficiente");
            }
        }else{
            System.out.println("Impossivel Sacar de uma conta Fechada");
        }
        
    }
    public void imprimirBoleto(){
        
        System.out.println("-----SALDO-----\n");
        this.getSaldo();
        System.out.println("---------------");
    }
    

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }
    
    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    public int getNumconta() {
        return numconta;
    }

    public void setNumconta(int numconta) {
        this.numconta = numconta;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    void getNumconta(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setSaldo(String b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
