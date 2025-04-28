package Prova;
public class Pintura extends ObraArte{
    private String tecnica;
    public Pintura() {
        super();
        this.tecnica = "Sem tecnica";
    }
    public void pintura(String titulo, String artista, String tecnica){
        super(titulo, artista);
        this.tecnica = tecnica;
    }

    public String getTecnica() {
        return tecnica;
    }

    public void setTecnica(String tecnica) {
        this.tecnica = tecnica;
    }

    public String descrever(){
        return "Pintura feita em ténica: oleo sobre a tela";
    }

    @Override
    public String toString() {
        return "Pintura{" +
                super.toString() +
                "tecnica='" + tecnica + '\'' +
                '}';
    }
}
