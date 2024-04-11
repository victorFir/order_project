package org.spring.eurder.order_managment_app.customer.dto;

import org.spring.eurder.order_managment_app.customer.model.Customer;
import org.springframework.stereotype.Component;

@Component
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

    public CustomerDTO mapToDto(Customer customer) {
        return new CustomerDTO(
//                customer.getCustomerId(),
                customer.getFirstName(),
                customer.getLastName(),
                customer.getEmail(),
                customer.getAddress(),
                customer.getPhoneNumber()
        );
    }
}
