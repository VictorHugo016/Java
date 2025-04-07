package RH;

public class Assistente extends Funcionarios{
    private float horaExtra;
    public Assistente() {
        super(); // chama construtor sem parâmetro do pai
    }
    public Assistente(String nome, String cpf, String endereco, float salario, float horaExtra) {
        super(nome, cpf, endereco, salario);
        this.horaExtra = horaExtra;
    }

    public float getHoraExtra() {
        return horaExtra;
    }

    public void setHoraExtra(float horaExtra) {
        this.horaExtra = horaExtra;
    }

    @Override
    public String toString() {
        return "Assistente{" +
                super.toString() +
                "horaExtra=" + horaExtra +
                '}';
    }
}
