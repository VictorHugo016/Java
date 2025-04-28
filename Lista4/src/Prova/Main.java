package Prova;

public class Main {
    public static void main(String[] args) {
        Pintura p1 = new Pintura("titulo1", "Victor", "Oleo");
        Escultura e1 = new Escultura("titulo2", "hugo", "Marmore");
        Instalacao i1 = new Instalacao("titulo3", "braga", false);

        exposicao ex1 = new Exposicao("leonardo da 20");

        ex1.addObra(p1);
        ex1.addObra(e1);
        ex1.addObra(i1);

        System.out.println(ex1.resumeExposicao())
    }
}
