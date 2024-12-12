public class Clothing extends Product {
    private String size;

    public Clothing(String name, double price, String category, int stock, String size) {
        super(name, price, category, stock);
        this.size = size;
    }

    @Override
    public String toString() {
        return super.toString() + "Size: " + size + "\n";
    }
}
