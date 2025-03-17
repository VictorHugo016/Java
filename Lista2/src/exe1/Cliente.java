package exe1;

public class Cliente {
    private String nroConta, nroAgencia, nome;
    private Float saldo;

    public void setnroConta(String nroConta) {

        if (nroConta.matches("\\d{6}-\\d")) {
            this.nroConta = nroConta;
            System.out.println("Nro Conta: " + this.nroConta);
        } else {
            System.out.println("O nro do conta está errado");
        }
    }
}
