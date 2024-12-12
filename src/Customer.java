import java.util.LinkedList;

public class Customer {
    private String name;
    private String email;
    private LinkedList<Order> orderHistory;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
        orderHistory = new LinkedList<>();
    }

    public String getName() {
        return name;
    }

    public void placeOrder(Order order) {
        orderHistory.push(order);
    }

    public void getOrderStatistic() {
        if (!orderHistory.isEmpty()) {
            System.out.println("Customer [" + name + "] Order History: ");

            for (Order order : orderHistory) {
                System.out.println(order.toString());
            }
        }
    }
}
