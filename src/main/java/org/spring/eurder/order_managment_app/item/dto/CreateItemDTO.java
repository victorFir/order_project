package org.spring.eurder.order_managment_app.item.dto;

public class CreateItemDTO {
    private String name;
    private String description;
    private int price;
    private int amountInStock;

    public CreateItemDTO(String name, String description, int price, int amountInStock) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.amountInStock = amountInStock;
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
