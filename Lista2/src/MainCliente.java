import exe1.Cliente;

public class MainCliente {
    public static void main(String[] args) {
        Cliente obj1 = new Cliente();
        obj1.setnroConta("123456-8");
        obj1.setnroAgencia("1234-6");
        obj1.setNome("Victor Hugo");
        obj1.setSaldo(15000);
        obj1.depositar(4000);
        obj1.setSaldo(2000);
        obj1.imprimir();
    }
}
