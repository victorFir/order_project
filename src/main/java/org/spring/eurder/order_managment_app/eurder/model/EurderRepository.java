package org.spring.eurder.order_managment_app.eurder.model;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class EurderRepository {
    private ConcurrentHashMap<String, Eurder> orders;

    public EurderRepository() {
        this.orders = new ConcurrentHashMap<>();
    }

    public Collection<Eurder> getAll() {
        return orders.values();
    }

    public Eurder addEurder(Eurder eurder) {
        orders.put(eurder.getOrderId(), eurder);
        return eurder;
    }
}
