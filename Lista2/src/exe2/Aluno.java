package exe2;

public class Aluno {
    private int nroAluno, idade;
    private String nome;
    private float p1, p2;

    public int getNroAluno() {
        return nroAluno;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public float getP1() {
        return p1;
    }

    public float getP2() {
        return p2;
    }

    public void setNroAluno(int nroAluno) {
        String aux = String.valueOf(nroAluno);
        if(aux.matches("\\d{6}")) {
            this.nroAluno = nroAluno;
        }
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setP1(float p1) {
        this.p1 = p1;
    }

    public void setP2(float p2) {
        this.p2 = p2;
    }

    public Aluno(int nroAluno, int idade, String nome, float p1, float p2) {
        this.setNroAluno(nroAluno);
        this.setIdade(idade);
        this.setNome(nome);
        this.setP1(p1);
        this.setP2(p2);
    }
}
