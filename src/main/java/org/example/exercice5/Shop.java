package org.example.exercice5;

import java.util.List;

public class Shop {
    private List<Product> products;

    public Shop(List<Product> products) {
        this.products = products;
    }

    public void update(Product product) {
        int qualityChange = getQualityChange(product);

        product.setSellIn(product.getSellIn() - 1);

        if(product.getSellIn() <= 0) qualityChange = -2;

        int newQuality = product.getQuality() + qualityChange;

        newQuality = Math.min(Math.max(newQuality, 0), 50);

        product.setQuality(newQuality );

    }

    private int getQualityChange(Product product) {
        return switch (product.getType()) {
            case "brie" -> 1;
            case "dairy" -> -2;
            default -> -1;
        };
    }
}
