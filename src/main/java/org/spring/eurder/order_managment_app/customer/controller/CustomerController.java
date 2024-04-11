package org.spring.eurder.order_managment_app.customer.controller;

import org.spring.eurder.order_managment_app.customer.dto.CreateCustomerDTO;
import org.spring.eurder.order_managment_app.customer.dto.CustomerDTO;
import org.spring.eurder.order_managment_app.customer.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CustomerDTO newCustomer(@RequestBody CreateCustomerDTO createCustomerDTO) {
        return customerService.createCustomer(createCustomerDTO);
    }
}
