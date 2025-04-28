package Prova;
import java.util.ArrayList;
import java.util.List;
public class exposicao {
    private String nome;
    private List<ObraArte> obras;

    public exposicao() {
        this.nome = "Sem nome";
        this.obra = new ArrayList<ObraArte>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<ObraArte> getObras() {
        return obras;
    }

    public void addObra(Obra obra){
        this.obra.add(obra);
    }

    public void exibirObras(){
        for(Obras obj : this.obras){
            System.out.println(obj.descreve());
        }
    }
    public String resumeExposicao(){
        this.exibirObras();
        return "Qtde de Obras" + this.obras.size() +
                "Exposição: " + this.nome;
    }

}
