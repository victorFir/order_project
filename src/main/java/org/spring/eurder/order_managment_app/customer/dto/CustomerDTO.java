package org.spring.eurder.order_managment_app.customer.dto;


public class CustomerDTO {
//    private String customerId;
    private final String firstName;
    private final String lastName;
    private final String email;
    private final AddressDTO address;
    private final String phoneNumber;

    public CustomerDTO( String firstName, String lastName, String email, AddressDTO address, String phoneNumber) {
//        this.customerId = customerId;
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
