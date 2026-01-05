public class Product {

    protected int id;
    protected String name;
    protected double price;
    protected int quantity;

    public Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void showInfo() {
        System.out.println(name + " | price: " + price + " | qty: " + quantity);
    }

    public String getType() {
        return "Product";
    }

    public boolean inStock() {
        return quantity > 0;
    }

    @Override
    public String toString() {
        return "[" + getType() + "] " + name + " (" + price + " KZT)";
    }
}
