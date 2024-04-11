package org.spring.eurder.order_managment_app.customer.service;

import org.spring.eurder.order_managment_app.customer.model.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
}
