package org.spring.eurder.order_managment_app.item.model;

import java.util.UUID;

public class Item {
    private String itemId;
    private String name;
    private String description;
    private int price;
    private int amountInStock;

    public Item(String name, String description, int price, int amountInStock) {
        this.itemId = UUID.randomUUID().toString();
        this.name = name;
        this.description = description;
        this.price = price;
        this.amountInStock = amountInStock;
    }

    public String getItemId() {
        return itemId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public int getAmountInStock() {
        return amountInStock;
    }
}
