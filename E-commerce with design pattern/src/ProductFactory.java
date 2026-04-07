class ProductFactory {
    public static Product getProduct(String type) {
        if (type.equalsIgnoreCase("laptop"))
            return new Product("Laptop", 50000);
        else if (type.equalsIgnoreCase("phone"))
            return new Product("Phone", 20000);
        else
            return new Product("Default", 1000);
    }
}