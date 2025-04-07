package RH;

public class Gerente extends Funcionarios {
    private float bonus;
    public Gerente() {
        super();
    }

    public Gerente(String nome, String cpf, String endereco, float salario, float bonus) {
        super(nome, cpf, endereco, salario);
        this.bonus = bonus;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    public float calcularSalario() {
        return this.salario + this.bonus;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                super.toString() +
                "Bonus=" + bonus +
                "}";
    }

}
