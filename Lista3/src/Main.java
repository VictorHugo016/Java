import exe1.CarItem;
import exe1.Product;
import exe1.ShoppingCart;

public class Main {
    public static void main(String[] args) {

        Product prod1 = new Product(1, "Bola de Basquete",
                500);
        Product prod2 = new Product(2, "Bola de Futebol",
                300);
        ShoppingCart sc1 = new ShoppingCart(100);
        sc1.addCarItem(11, 3, prod1);
        sc1.addCarItem(12, 5, prod2);
        System.out.println(sc1);

    }
}