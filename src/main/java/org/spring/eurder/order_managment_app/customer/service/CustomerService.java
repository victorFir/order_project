package org.spring.eurder.order_managment_app.customer.service;

import org.spring.eurder.order_managment_app.customer.dto.*;
import org.spring.eurder.order_managment_app.customer.model.Customer;
import org.spring.eurder.order_managment_app.customer.model.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;

    private final AddressMapper addressMapper;

    public CustomerService(CustomerRepository customerRepository, CustomerMapper customerMapper, AddressMapper addressMapper) {
        this.customerRepository = customerRepository;
        this.customerMapper = customerMapper;
        this.addressMapper = addressMapper;
    }

    public CustomerDTO createCustomer(CreateCustomerDTO createCustomerDto) {
        Customer customer = customerMapper.mapToCustomer(createCustomerDto);
        Customer savedCustomer = customerRepository.addCustomer(customer);
        return customerMapper.mapToDto(savedCustomer);
    }
}
