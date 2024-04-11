package org.spring.eurder.order_managment_app.customer.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.spring.eurder.order_managment_app.customer.model.Address;

public class CustomerDTO {
//    private String customerId;
    private String firstName;
    private String lastName;
    private String email;
    private Address address;
    private String phoneNumber;

    public CustomerDTO( String firstName, String lastName, String email, Address address, String phoneNumber) {
//        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
}
