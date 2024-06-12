package Exercice5;

import org.example.exercice5.Product;
import org.example.exercice5.Shop;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShopTest {

    @Test
    public void testSellInDecreases() {
        Product product = new Product("normal", "product", 10, 20);
        Shop shop = new Shop(List.of(product));
        shop.update(product);
        assertEquals(9, product.getSellIn());
    }

    @Test
    public void testQualityDecreases() {
        Product product = new Product("normal", "product", 10, 20);
        Shop shop = new Shop(List.of(product));
        shop.update(product);
        assertEquals(19, product.getQuality());
    }
}
