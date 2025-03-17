import exe0.Carro;

public class MainCarro {
    public static void main(String[] args) {
        Carro obj1 = new Carro();
        obj1.setAno(2021);
        System.out.println("modelo: " + obj1.getModelo());

        Carro obj2 = new Carro("Fiat", "Palio", 2022, 0);
        obj2.acelerar(70);
        obj2.frear(20);

        System.out.println();
    }

    public static class Cliente {
    }
}
