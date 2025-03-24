import exe1.Product;
import exe1.CarItem;


public class Main {
    public static void main(String[] args) {
        Product obj1 = new Product(1, "Bola", 99.99F);

        CarItem obj2 = new CarItem(11, 3, obj1);

        System.out.println(obj2.showCarItem());
    }
}
