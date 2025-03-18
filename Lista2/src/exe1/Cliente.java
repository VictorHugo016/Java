package exe1;

public class Cliente {
    private String nroConta, nroAgencia, nome;
    private float saldo, valor;

    public void setnroConta(String nroConta) {

        if (nroConta.matches("\\d{6}-\\d")) {
            this.nroConta = nroConta;
        } else {
            System.out.println("O nro do conta está errado");
        }
    }

    public void setnroAgencia(String nroAgencia) {
        if (nroAgencia.matches("\\d{4}-\\d")) {
            this.nroAgencia = nroAgencia;
        }
        else{
     System.out.println("O numero da agencia está errado");
        }
    }
    public void setNome(String nome) {
        if(nome.length()<30){
            this.nome = nome;
        }
        else{
            System.out.println("nome tem mais de 30 caracteres");
        }
    }

    public void setSaldo(float saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        }
        else{
            System.out.println("O saldo deve ser maior que 0");
        }
    }

    public String getNroConta() {
        return nroConta;
    }

    public String getNroAgencia() {
        return nroAgencia;
    }

    public String getNome() {
        return nome;
    }

    public float getSaldo() {
        return saldo;
    }
    public void imprimir(){
        System.out.println("Nro Conta: " + nroConta);
        System.out.println("Nro Agencia: " + nroAgencia);
        System.out.println("Nome: " + nome);
        System.out.println("Saldo: " + saldo);
    }
    public void depositar(float valor) {
        if (valor > 0) {
            this.setSaldo(this.saldo + valor);
        }
    }
    public void sacar(float valor){
            if(valor>0){
                this.setSaldo(saldo-valor);
            }
        }

    public Cliente() {
        this.nroConta = "123467-5";
        this.nome = "Victor Hugo";
        this.saldo = 2022;
        this.nroAgencia = "1234-6";
    }

    public Cliente(String nroConta, String nroAgencia, String nome, float saldo) {
        this.setnroConta(nroConta);
        this.setnroAgencia(nroAgencia);
        this.setNome(nome);
        this.setSaldo(saldo);
    }
}
