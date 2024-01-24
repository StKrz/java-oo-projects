package gr.aueb.cf.ch20.lambda;

/**
 * That class represents a product.
 */
public class Product {
    private String id;
    private String title;
    private double price;
    private int quantity;

    public Product() {

    }

    public Product(String id, String title, double price, int quantity) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public static void printOnlyTitle(Product product) {
        System.out.printf("Title: %s.\n", product.getTitle());
    }

    public static void printProduct(Product product) {
        System.out.printf("ID: %s,\tTitle: %s,\tPrice: %s$,\tQuantity: %d.\n",
                product.getId(), product.getTitle(), product.getPrice(), product.getQuantity());
    }

    @Override
    public String toString() {
        return "{" +
                "id='" + id + '\'' +
                ",\ttitle='" + title + '\'' +
                ",\tprice=" + price +
                ",\tquantity=" + quantity +
                '}';
    }
}
