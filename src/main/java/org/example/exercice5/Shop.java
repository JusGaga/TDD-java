package org.example.exercice5;

import java.util.List;

public class Shop {
    private List<Product> products;

    public Shop(List<Product> products) {
        this.products = products;
    }

    public void update(Product product) {
        product.setSellIn(product.getSellIn() - 1);
        product.setQuality(product.getQuality() - 1);
    }
}
