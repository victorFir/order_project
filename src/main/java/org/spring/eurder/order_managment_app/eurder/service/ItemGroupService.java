package org.spring.eurder.order_managment_app.eurder.service;

import org.spring.eurder.order_managment_app.eurder.dto.ItemGroupDTO;
import org.spring.eurder.order_managment_app.eurder.model.ItemGroup;
import org.spring.eurder.order_managment_app.item.model.Item;
import org.spring.eurder.order_managment_app.item.model.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ItemGroupService {
    private final ItemRepository itemRepository;

    public ItemGroupService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public ItemGroupDTO createItemGroup(String itemId, int amount) {
        Optional<Item> optionalItem = itemRepository.getItemById(itemId);
        if (optionalItem.isPresent()) {
            return new ItemGroupDTO(itemId, amount);
        } else {
            throw new IllegalArgumentException("Item with ID " + itemId + " not found.");
        }
    }

}
