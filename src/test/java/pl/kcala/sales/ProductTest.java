package pl.kcala.sales;

import main.java.pl.kcala.sales.Product;
import org.junit.Assert;
import org.junit.Test;

public class ProductTest {

    @Test
    public void itVerifyStockAvailability() {
        Product inStock = new Product("lego", 10);
        Product notInStock = new Product("lego", 0);

        Assert.assertTrue(inStock.isInStock());
        Assert.assertFalse(notInStock.isInStock());
    }
}
