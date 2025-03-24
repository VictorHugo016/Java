package exe1;

public class CarItem {
    private int id;
    private int quantity;

    private Product product;

    public CarItem() {
        this.product = new Product();
    }

    public CarItem(int id, int quantity, Product product) {
        this.setId(id);
        this.setQuantity(quantity);
        this.setProduct(product);
    }

    public int getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String showCarItem() {
        return "carItem{" +
                "id=" + id +
                ", quantity=" + quantity +
                ", product=" + product.showProduct() +
                '}';
    }
}
