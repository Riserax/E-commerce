package pl.kcala.sales;

public class Product {

    private String name;
    private final Integer stockQty;

    public Product(String name, Integer stockQty) {
        this.name = name;
        this.stockQty = stockQty;
    }

    public Product(String name) {
        this.stockQty = 0;
    }

    public boolean isInStock() {
        return stockQty > 0;
    }

    public String getName() {
        return name;
    }
}
