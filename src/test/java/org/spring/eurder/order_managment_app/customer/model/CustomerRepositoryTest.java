package org.spring.eurder.order_managment_app.customer.model;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.spring.eurder.order_managment_app.customer.model.Constants.CUSTOMER_1;

class CustomerRepositoryTest {
    private CustomerRepository customerRepository;

    @BeforeEach
    void  setUp() {
        this.customerRepository = new CustomerRepository();
    }

    @Test
    void givenCustomer_whenCreateCustomer_thenAddAndReturnCustomer() {
        customerRepository.createCustomer(CUSTOMER_1);
        Assertions.assertThat(customerRepository.getAll().contains(CUSTOMER_1));
    }
}