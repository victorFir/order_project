package org.spring.eurder.order_managment_app.customer.dto;

import org.spring.eurder.order_managment_app.customer.model.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapper {

    private final AddressMapper addressMapper;

    public CustomerMapper(AddressMapper addressMapper) {
        this.addressMapper = addressMapper;
    }
    public Customer mapToCustomer(CreateCustomerDTO createCustomerDTO) {
        return new Customer(
                createCustomerDTO.getFirstName(),
                createCustomerDTO.getLastName(),
                createCustomerDTO.getEmail(),
                addressMapper.mapToAddress(createCustomerDTO.getAddress()),
                createCustomerDTO.getPhoneNumber()
        );
    }

    public CustomerDTO mapToDto(Customer customer) {
        return new CustomerDTO(
//                customer.getCustomerId(),
                customer.getFirstName(),
                customer.getLastName(),
                customer.getEmail(),
                addressMapper.mapToDto(customer.getAddress()),
                customer.getPhoneNumber()
        );
    }
}
