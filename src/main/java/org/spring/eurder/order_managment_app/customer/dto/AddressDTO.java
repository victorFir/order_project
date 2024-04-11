package org.spring.eurder.order_managment_app.customer.dto;

public class AddressDTO {
    private String street;
    private String houseNumber;
    private String city;
    private String postalCode;


    public AddressDTO(String street, String houseNumber, String city, String postalCode) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.city = city;
        this.postalCode = postalCode;
    }

    public String getStreet() {
        return street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public String getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }
}
