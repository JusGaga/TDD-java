package org.example.exercice5;

import java.util.List;

public class Shop {
    private List<Product> products;

    public Shop(List<Product> products) {
        this.products = products;
    }

    public void update(Product product) {
        int qualityChange = -1;

        product.setSellIn(product.getSellIn() - 1);

        if (product.getType().equals("brie")){
            qualityChange = 1;
        }

        if(product.getSellIn() <= 0) {
            qualityChange = -2;
        }

        int newQuality = product.getQuality() + qualityChange;

        if (newQuality < 0) {
            newQuality = 0;
        }

        if (newQuality > 50) {
            newQuality = 50;
        }

        product.setQuality(newQuality );

    }
}
