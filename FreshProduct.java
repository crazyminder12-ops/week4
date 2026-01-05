public class FreshProduct extends Product {

    private int daysToExpire;

    public FreshProduct(int id, String name, double price, int quantity, int daysToExpire) {
        super(id, name, price, quantity);
        this.daysToExpire = daysToExpire;
    }

    @Override
    public void showInfo() {
        System.out.println("Fresh: " + name + " | expires in " + daysToExpire + " days");
    }

    @Override
    public String getType() {
        return "Fresh Product";
    }

    // уникальные методы
    public boolean isExpiredSoon() {
        return daysToExpire <= 2;
    }

    public int getDaysToExpire() {
        return daysToExpire;
    }
}
