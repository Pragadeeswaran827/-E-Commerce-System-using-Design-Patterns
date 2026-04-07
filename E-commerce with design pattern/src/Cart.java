import java.util.*;

class Cart {
    private static Cart instance;
    private List<Product> products = new ArrayList<>();

    private Cart() {}

    public static Cart getInstance() {
        if (instance == null)
            instance = new Cart();
        return instance;
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public int getTotal() {
        int sum = 0;
        for (Product p : products)
            sum += p.getPrice();
        return sum;
    }

    public void showCart() {
        for (Product p : products)
            System.out.println(p.getName() + " - " + p.getPrice());
    }
}