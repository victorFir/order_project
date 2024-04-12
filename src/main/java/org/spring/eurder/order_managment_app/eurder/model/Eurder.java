package org.spring.eurder.order_managment_app.eurder.model;

import java.util.Collection;
import java.util.UUID;

public class Eurder {
    private String orderId;
    private  String customerId;
    private Collection<itemGroup> items;
    private int totalPrice;

    public Eurder(String orderId, String customerId, Collection<itemGroup> items, int totalPrice) {
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

    public Collection<itemGroup> getItems() {
        return items;
    }

    public int getTotalPrice() {
        return totalPrice;
    }
}
