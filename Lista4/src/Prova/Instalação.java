package Prova;
public class Instalacao extends ObraArte {
    private boolean interativa;
    public Instalacao() {
       super();
    }
    public Instalacao( String titulo, String artista, Boolean interativa ){
       super(titulo, artista);
       this.interativa = interativa;
    }
    public boolean isInterativa() {
       return interativa;
    }
    public void setInterativa(boolean interativa) {
       this.interativa = interativa;
    }

    @Override
    public String toString() {
        return "Instalacao{" +
                super.toString() +
                "interativa=" + interativa +
                '}';
    }

    public String descrever(){
       return this.interativa ?
               "Instalacao interativa" :
               "Instalacao nao interativa";
    }
}

