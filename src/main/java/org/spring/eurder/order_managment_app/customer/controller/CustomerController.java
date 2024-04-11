package org.spring.eurder.order_managment_app.customer.controller;

import org.spring.eurder.order_managment_app.customer.dto.CreateCustomerDTO;
import org.spring.eurder.order_managment_app.customer.dto.CustomerDTO;
import org.spring.eurder.order_managment_app.customer.service.CustomerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping(path = "/sign-up", consumes = "application/json", produces = "application/json")
    public CustomerDTO createCustomer(@RequestBody CreateCustomerDTO createCustomerDTO) {
        return customerService.createCustomer(createCustomerDTO);
    }
}
