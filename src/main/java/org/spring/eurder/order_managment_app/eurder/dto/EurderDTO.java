package org.spring.eurder.order_managment_app.eurder.dto;

import org.spring.eurder.order_managment_app.eurder.model.ItemGroup;

import java.util.Collection;

public class EurderDTO {
    private  String customerId;
    private Collection<ItemGroupDTO> items;
    private int totalPrice;

    public EurderDTO(String customerId, Collection<ItemGroupDTO> items, int totalPrice) {
        this.customerId = customerId;
        this.items = items;
        this.totalPrice = totalPrice;
    }

    public String getCustomerId() {
        return customerId;
    }

    public Collection<ItemGroupDTO> getItems() {
        return items;
    }

    public int getTotalPrice() {
        return totalPrice;
    }
}
