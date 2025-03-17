import exe0.Carro;

public class MainCarro {
    public static void main(String[] args) {
        Carro obj1=new Carro();
        obj1.setAno(2021);
        System.out.println("modelo: " + obj1.getMoldelo());

        Carro obj2 = new Carro("Fiat", "Palio", 2022, 0);
    }
}
