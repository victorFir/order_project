package org.spring.eurder.order_managment_app.customer.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.spring.eurder.order_managment_app.customer.dto.CustomerMapper;
import org.spring.eurder.order_managment_app.customer.model.CustomerRepository;

import static org.junit.jupiter.api.Assertions.*;
import static org.spring.eurder.order_managment_app.customer.Constants.CREATE_CUSTOMER_DTO_1;

@ExtendWith(MockitoExtension.class)
class CustomerServiceTest {
    @Mock
    CustomerRepository customerRepository;
    @Mock
    CustomerMapper customerMapper;
    @InjectMocks
    CustomerService customerService;

    @Test
    void givenCreateCustomerDTO_whenCreateCustomer_thenAddCustomer() {
        customerService.createCustomer(CREATE_CUSTOMER_DTO_1);

        Mockito.verify(customerRepository).addCustomer(customerMapper.mapToCustomer(CREATE_CUSTOMER_DTO_1));
    }
}