package org.spring.eurder.order_managment_app.eurder.model;


import java.util.Collection;
import java.util.UUID;

public class Eurder {
    private String orderId;
    private  String customerId;
    private Collection<ItemGroup> items;
    private int totalPrice;

    public Eurder(String customerId, Collection<ItemGroup> items, int totalPrice) {
        this.orderId = UUID.randomUUID().toString();
        this.customerId = customerId;
        this.items = items;
        this.totalPrice = totalPrice;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public Collection<ItemGroup> getItems() {
        return items;
    }

    public int getTotalPrice() {
        return totalPrice;
    }
}
