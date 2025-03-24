package exe1;

public class Product {
    private int id;
    private String description;
    private float price;

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public float getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Product(int id, String description, float price) {
        this.setId(id);
        this.setDescription(description);
        this.setPrice(price);
    }

    public Product() {
        this.description = "No Description";
    }

    public String showProduct() {
        return "Product{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }


}
