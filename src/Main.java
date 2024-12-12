import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    static public void main(String[] args) {
        StoreManager sm = new StoreManager();

        sm.addCustomer(new Customer("C1", "C1@ABC.COM"));
        sm.addCustomer(new Customer("C2", "C2@ABC.COM"));
        sm.addCustomer(new Customer("C3", "C3@ABC.COM"));

        sm.addProduct(new Electronics("electr1", 9.99, "Electronics", 74, "warr1"));
        sm.addProduct(new Clothing("cloth1", 49.50, "Clothing", 5, "size1"));
        sm.addProduct(new Electronics("electr2", 16.99, "Electronics", 3, "warr3"));

        sm.displayProducts();

        Order o1 = new Order(1);

        Product p = sm.getProduct("electr1");
        o1.addProduct(p, 2);
        p.reduceStock(2);
        sm.updateProduct(p.getName(), p);

        p = sm.getProduct("cloth1");
        o1.addProduct(p, 7);
        p.reduceStock(7);
        sm.updateProduct(p.getName(), p);

        Order o2 = new Order(2);
        p = sm.getProduct("electr2");
        o2.addProduct(p, 4);
        p.reduceStock(4);
        sm.updateProduct(p.getName(), p);

        Customer c1 = sm.getCustomer("C1");
        c1.placeOrder(o1);
        c1.placeOrder(o2);
        sm.updateCustomer("C1", c1);

        sm.generateReport();

        p = sm.getProduct("electr1");
        p.applyDiscount(.1); // 8.99
        sm.updateProduct("electr1", p);

        sm.generateReport();

        sm.removeOutOfStock();

        sm.displayProducts();
    }
}