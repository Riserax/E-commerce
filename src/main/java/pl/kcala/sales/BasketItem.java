package pl.kcala.sales;

public class BasketItem {
    private String productName;
    private Integer quantity;

    public BasketItem(String productName, Integer quantity) {
        this.productName = productName;
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public String getName() {
        return productName;
    }
}
