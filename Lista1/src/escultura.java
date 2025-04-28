package Prova;
public class Escultura extends ObraArte{
    private String material;
    public Escultura() {
        super();
        this.material = "Sem material";
    }
    public Escultura(String titulo, String artista, String material){
        super(titulo, artista)
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String descrever(){
        return "Escultura esculpida em mármore";
    }

    @Override
    public String toString() {
        return "Escultura{" +
                super.toString() +
                "material='" + material + '\'' +
                '}';
    }
}
