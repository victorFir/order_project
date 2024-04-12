package org.spring.eurder.order_managment_app.item.dto;

import org.spring.eurder.order_managment_app.item.model.Item;
import org.springframework.stereotype.Component;

@Component
public class ItemMapping {
    public Item mapToItem (CreateItemDTO createItemDTO) {
        return new Item(
                createItemDTO.getName(),
                createItemDTO.getDescription(),
                createItemDTO.getPrice(),
                createItemDTO.getAmountInStock()
        );
    }

    public ItemDTO mapToDto(Item item) {
        return new ItemDTO(
                item.getName(),
                item.getDescription(),
                item.getPrice(),
                item.getAmountInStock()
        );
    }
}
