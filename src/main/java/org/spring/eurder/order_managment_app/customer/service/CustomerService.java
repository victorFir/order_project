package org.spring.eurder.order_managment_app.customer.service;

import org.spring.eurder.order_managment_app.customer.dto.CreateCustomerDTO;
import org.spring.eurder.order_managment_app.customer.dto.CustomerMapper;
import org.spring.eurder.order_managment_app.customer.model.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private CustomerRepository customerRepository;
    private CustomerMapper customerMapper;

    public CustomerService(CustomerRepository customerRepository, CustomerMapper customerMapper) {
        this.customerRepository = customerRepository;
        this.customerMapper = customerMapper;
    }

    public void createCustomer(CreateCustomerDTO createCustomerDto) {
        customerRepository.addCustomer(customerMapper.mapToCustomer(createCustomerDto));
    }
}
