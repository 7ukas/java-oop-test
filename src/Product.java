abstract class Product implements Discountable {
    private String productName;
    private double price;
    private String category;
    private int stock;

    public Product(String name, double price, String category, int stock) {
        this.productName = name;
        this.price = price;
        this.category = category;
        this.stock = stock;
    }

    public void applyDiscount(double discount) {
        price = price * (1 - discount);
    }

    public void applyBulkDiscount(int quantity, double discount) {
        if (stock >= quantity) {
            price = price * (1 - discount);
        }
    }

    public void reduceStock(int reduce) {
        this.stock -= reduce;
        if (this.stock < 0) this.stock = 0;
    }

    public String getName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public int getStock() {
        return stock;
    }
    
    @Override
    public String toString() {
        return "Name: " + productName + "\nPrice: " + price + "\nCategory: " + category + "\nStock: " + stock + "\n";
    }
}
