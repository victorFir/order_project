package org.spring.eurder.order_managment_app.customer.dto;

import org.spring.eurder.order_managment_app.customer.model.Address;

public class CreateCustomerDTO {
    private String firstName;
    private String lastName;
    private String email;
    private AddressDTO address;
    private String phoneNumber;


    public CreateCustomerDTO(String firstName, String lastName, String email, AddressDTO address, String phoneNumber) {
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

    public AddressDTO getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

}
