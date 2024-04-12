package org.spring.eurder.order_managment_app.item.service;

import org.spring.eurder.order_managment_app.item.dto.ItemMapping;
import org.spring.eurder.order_managment_app.item.model.ItemRepository;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    private ItemRepository itemRepository;
    private ItemMapping itemMapping;

    public ItemService(ItemRepository itemRepository, ItemMapping itemMapping) {
        this.itemRepository = itemRepository;
        this.itemMapping = itemMapping;
    }
}
