package org.spring.eurder.order_managment_app.customer.model;

public class Address {
    private String street;
    private String houseNumber;
    private String city;
    private String postalCode;


    public Address(String street, String houseNumber, String city, String postalCode) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.city = city;
        this.postalCode = postalCode;
    }
}
