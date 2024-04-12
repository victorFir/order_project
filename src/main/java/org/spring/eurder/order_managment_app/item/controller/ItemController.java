package org.spring.eurder.order_managment_app.item.controller;

import org.spring.eurder.order_managment_app.item.dto.CreateItemDTO;
import org.spring.eurder.order_managment_app.item.dto.ItemDTO;
import org.spring.eurder.order_managment_app.item.service.ItemService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/items")
public class ItemController {
    private ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ItemDTO newItem(@RequestBody CreateItemDTO createItemDTO) {
        return itemService.createItem(createItemDTO);
    }
}
