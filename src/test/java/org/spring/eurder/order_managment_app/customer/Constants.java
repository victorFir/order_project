package org.spring.eurder.order_managment_app.customer;

import org.spring.eurder.order_managment_app.customer.dto.AddressDTO;
import org.spring.eurder.order_managment_app.customer.dto.CreateCustomerDTO;
import org.spring.eurder.order_managment_app.customer.model.Address;
import org.spring.eurder.order_managment_app.customer.model.Customer;

public class Constants {
    public static final Customer CUSTOMER_1 = new Customer("Vic", "Fir", "vicfir@test.com", new Address("testStreet", "12", "testCity", "1190"), "0123456789");

    public static final CreateCustomerDTO CREATE_CUSTOMER_DTO_1 = new CreateCustomerDTO("Igo", "Fir", "igofir@test.com", new AddressDTO("testStreet2", "11", "testCity2", "01633"), "0123456789");
}
