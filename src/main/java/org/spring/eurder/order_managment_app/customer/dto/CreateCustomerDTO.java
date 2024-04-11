package org.spring.eurder.order_managment_app.customer.dto;

import org.spring.eurder.order_managment_app.customer.model.Address;
import org.springframework.stereotype.Component;

public class CreateCustomerDTO {
    private String firstName;
    private String lastName;
    private String email;
    private Address address;
    private String phoneNumber;

    public CreateCustomerDTO(String firstName, String lastName, String email, Address address, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public Address getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Component
    public static class CustomerMapper {
    }
}
