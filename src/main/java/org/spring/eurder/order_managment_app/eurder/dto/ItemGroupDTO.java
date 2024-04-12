package org.spring.eurder.order_managment_app.eurder.dto;

import java.time.LocalDate;

public class ItemGroupDTO {
    private String itemId;
    private int amount;
    private LocalDate shippingDate;

    public ItemGroupDTO(String itemId, int amount, LocalDate shippingDate) {
        this.itemId = itemId;
        this.amount = amount;
        this.shippingDate = shippingDate;
    }

    public String getItemId() {
        return itemId;
    }

    public int getAmount() {
        return amount;
    }

    public LocalDate getShippingDate() {
        return shippingDate;
    }
}
