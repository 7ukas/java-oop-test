import java.util.ArrayList;
import java.util.LinkedList;

public class StoreManager {
    private ArrayList<Product> products;
    private LinkedList<Customer> customers;

    public StoreManager() {
        products = new ArrayList<>();
        customers = new LinkedList<>();
    }

    public void addCustomer(Customer customer) {
        customers.push(customer);
    }

    public Customer getCustomer(String name) {
        int id = getCustomerId(name);
        return id >= 0 ? customers.get(id) : null;
    }

    private int getCustomerId(String name) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getName().equals(name)) {
                return i;
            }
        }

        return -1;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public Product getProduct(String name) {
        int id = getProductId(name);
        return id >= 0 ? products.get(id) : null;
    }

    private int getProductId(String name) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equals(name)) {
                return i;
            }
        }

        return -1;
    }

    public void updateCustomer(String name, Customer customer) {
        int id = getCustomerId(name);

        if (id >= 0) {
            customers.remove(id);
            customers.add(id, customer);
        }
    }

    public void updateProduct(String name, Product product) {
        int id = getProductId(name);

        if (id >= 0) {
            products.remove(id);
            products.add(id, product);
        }
    }

    public void generateReport() {
        if (!customers.isEmpty()) {
            for (Customer c: customers) {
                c.getOrderStatistic();
            }
        }
    }

    public void removeOutOfStock() {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getStock() < 1) {
                products.remove(i);
            }
        }
    }

    public void displayProducts() {
        if (!products.isEmpty()) {
            for (Product p : products) {
                System.out.println(p.toString());
            }
        }
    }
}
