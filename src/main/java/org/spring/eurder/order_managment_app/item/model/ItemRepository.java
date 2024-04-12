package org.spring.eurder.order_managment_app.item.model;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;

public class ItemRepository {
    private ConcurrentHashMap<String, Item> items;

    public ItemRepository() {
        this.items = new ConcurrentHashMap<>();
    }

    public Collection<Item> getAll() { return items.values(); }

    public Item addItem(Item item) {
        items.put(item.getItemId(), item);
        return item;
    }
}
