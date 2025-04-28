package Prova;

public abstract class ObraArte {
    protected String titulo, artista;

    public ObraArte() { this.titulo = "Sem titulo"; this.artista = "Sem artista"; }
    public ObraArte(String titulo, String artista) {
        this.titulo = titulo;
        this.artista = artista;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    @Override
    public String toString() {
        return "ObraArte{" +
                "titulo='" + titulo + '\'' +
                ", artista='" + artista + '\'' +
                '}';
    }

    public abstract String descrever();
}


