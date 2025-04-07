package RH;

public class Diretor extends Funcionarios {
    private float acoesEmpresa;
    public Diretor() {
        super();
    }
    public Diretor(String nome, String cpf, String senha, float salario) {
        super(nome, cpf, senha, salario);
        this.acoesEmpresa = acoesEmpresa;

    }
    public float getAcoesEmpresa() {
        return acoesEmpresa;
    }
    public void setAcoesEmpresa(float acoesEmpresa) {
        this.acoesEmpresa = acoesEmpresa;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                super.toString() +
                "açoes da Empresa=" + acoesEmpresa +
                "}";
    }
    public float calculaSalario() {
        return this.salario * this.acoesEmpresa;
    }

}
