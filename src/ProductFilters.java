import java.util.ArrayList;
import java.util.List;

public class ProductFilters {
    static public List<Product> filterByCategory(List<Product> products, String category) {
        List<Product> filtered = new ArrayList<>();

        for (int i = 0; i < products.size(); i++) {
            Product p = products.get(i);

            if (p.getCategory().equalsIgnoreCase(category)) {
                filtered.add(p);
            }
        }

        return filtered;
    }

    static public List<Product> filterByPriceRange(List<Product> products, double minPrice, double maxPrice) {
        List<Product> filtered = new ArrayList<>();

        for (int i = 0; i < products.size(); i++) {
            Product p = products.get(i);
            double price = p.getPrice();

            if (price >= minPrice && price <= maxPrice) {
                filtered.add(p);
            }
        }

        return filtered;
    }
}
