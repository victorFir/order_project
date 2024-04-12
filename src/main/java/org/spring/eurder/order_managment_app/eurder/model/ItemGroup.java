package org.spring.eurder.order_managment_app.eurder.model;

import java.time.LocalDate;

public class ItemGroup {
    private String itemId;
    private int amount;
    private LocalDate shippingDate;

    public ItemGroup(String itemId, int amount) {
        this.itemId = itemId;
        this.amount = amount;
        this.shippingDate = LocalDate.now().plusDays(1);;
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
