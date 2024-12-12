public class Electronics extends Product {
    private String warrantyPeriod;

    public Electronics(String name, double price, String category, int stock, String warrantyPeriod) {
        super(name, price, category, stock);
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public String toString() {
        return super.toString() + "Warranty: " + warrantyPeriod + "\n";
    }
}
