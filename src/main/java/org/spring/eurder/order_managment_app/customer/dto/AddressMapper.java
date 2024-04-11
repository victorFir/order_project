package org.spring.eurder.order_managment_app.customer.dto;

import org.spring.eurder.order_managment_app.customer.model.Address;
import org.springframework.stereotype.Component;

@Component
public class AddressMapper {
    public Address mapToAddress(AddressDTO addressDTO) {
        return new Address(
                addressDTO.getStreet(),
                addressDTO.getHouseNumber(),
                addressDTO.getCity(),
                addressDTO.getPostalCode()
        );
    }
    public AddressDTO mapToDto(Address address) {
        return new AddressDTO(
//                customer.getAddressId(),
                address.getStreet(),
                address.getHouseNumber(),
                address.getCity(),
                address.getPostalCode()
        );
    }
}
