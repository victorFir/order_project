package org.spring.eurder.order_managment_app.customer.model;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class CustomerRepository {
    private final ConcurrentHashMap<String, Customer> customers;

    public CustomerRepository() {
        this.customers = new ConcurrentHashMap<>();
    }

    public Collection<Customer> getAll() {
        return customers.values();
    }

    public Customer addCustomer(Customer customer) {
        customers.put(customer.getCustomerId(), customer);
        return customer;
    }
}
