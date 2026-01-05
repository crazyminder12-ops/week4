public class PackagedProduct extends Product {

    private String brand;

    public PackagedProduct(int id, String name, double price, int quantity, String brand) {
        super(id, name, price, quantity);
        this.brand = brand;
    }

    @Override
    public void showInfo() {
        System.out.println("Packaged: " + name + " | brand: " + brand);
    }

    @Override
    public String getType() {
        return "Packaged Product";
    }

    // уникальные методы
    public String getBrand() {
        return brand;
    }

    public boolean isPopularBrand() {
        return brand.length() > 3;
    }
}
