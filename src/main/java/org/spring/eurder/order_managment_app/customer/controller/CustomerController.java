package org.spring.eurder.order_managment_app.customer.controller;

import org.spring.eurder.order_managment_app.customer.dto.CreateCustomerDTO;
import org.spring.eurder.order_managment_app.customer.dto.CustomerDTO;
import org.spring.eurder.order_managment_app.customer.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/home")
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping(path = "/addCustomer", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<CustomerDTO> newCustomer(@RequestBody CreateCustomerDTO createCustomerDTO) {
        return new ResponseEntity<>(customerService.createCustomer(createCustomerDTO), HttpStatus.CREATED);
    }
}
