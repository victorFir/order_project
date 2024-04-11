package org.spring.eurder.order_managment_app.customer.model;

import java.util.UUID;

public class Customer {
    String customerId;
    String firstName;
    String lastName;
    String email;
    Address address;
    String phoneNumber;

    public Customer(String firstName, String lastName, String email, Address address, String phoneNumber) {
        this.customerId = UUID.randomUUID().toString();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getCustomerId() {
        return customerId;
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
}
