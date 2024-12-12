import java.util.LinkedList;

public class Order {
    private int orderId;
    private LinkedList<OrderItem> orderItems;

    public Order(int id) {
        this.orderId = id;
        orderItems = new LinkedList<>();
    }

    public void addProduct(Product product, int quantity) {
        orderItems.push(new OrderItem(product, quantity));
    }

    public double calculateTotal() {
        double total = 0;

        for (int i = 0; i < orderItems.size(); i++) {
            total += orderItems.get(i).getSubtotal();
        }

        return total;
    }

    public void applyDiscount() {
    }

    @Override
    public String toString() {
        return "Order ID: " + orderId + "\nUnique Products: " + orderItems.size() + "\nTotal Price: " + calculateTotal() + "\n";
    }
}
