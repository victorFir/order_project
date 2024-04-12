package org.spring.eurder.order_managment_app.item.service;

import org.spring.eurder.order_managment_app.item.dto.CreateItemDTO;
import org.spring.eurder.order_managment_app.item.dto.ItemDTO;
import org.spring.eurder.order_managment_app.item.dto.ItemMapping;
import org.spring.eurder.order_managment_app.item.model.Item;
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

    public ItemDTO createItem(CreateItemDTO createItemDTO) {
        Item item = itemMapping.mapToItem(createItemDTO);
        Item savedItem = itemRepository.addItem(item);
        return itemMapping.mapToDto(savedItem);
    }
}
