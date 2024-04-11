package org.spring.eurder.order_managment_app.customer.dto;

import org.spring.eurder.order_managment_app.customer.model.Customer;

public class CustomerMapper {
    public Customer mapToCustomer(CreateCustomerDTO createCustomerDTO) {
        return new Customer(
                createCustomerDTO.getFirstName(),
                createCustomerDTO.getLastName(),
                createCustomerDTO.getEmail(),
                createCustomerDTO.getAddress(),
                createCustomerDTO.getPhoneNumber()
        );
    }
}
