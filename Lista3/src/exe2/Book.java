package exe2;

public class Book {
    private int ID;
    private String tittle, autor;

    public Book() {

    }

    public Book(int ID, String tittle, String autor) {
        this.setID(ID);
        this.setTittle(tittle);
        this.setAutor(autor);
    }

    public int getID() {
        return ID;
    }

    public String getTittle() {
        return tittle;
    }

    public String getAutor() {
        return autor;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ID=" + ID +
                ", tittle='" + tittle + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
}
