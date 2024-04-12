package org.spring.eurder.order_managment_app.eurder.dto;

import org.spring.eurder.order_managment_app.eurder.model.Eurder;
import org.springframework.stereotype.Component;

@Component
public class EurderMapper {
    private final ItemGroupMapper itemGroupMapper;

    public EurderMapper(ItemGroupMapper itemGroupMapper) {
        this.itemGroupMapper = itemGroupMapper;
    }

    public Eurder mapToEurder(CreateEurderDTO createEurderDTO) {
        return  new Eurder(
                createEurderDTO.getCustomerId(),
                itemGroupMapper.collectionMapToItemGroup(createEurderDTO.getItems()),
                createEurderDTO.getTotalPrice()
        );
    }

    public EurderDTO mapToDto(Eurder eurder) {
        return new EurderDTO(
                eurder.getCustomerId(),
                itemGroupMapper.collectionMapToDto(eurder.getItems()),
                eurder.getTotalPrice()
        );
    }

}
