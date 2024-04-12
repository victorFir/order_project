package org.spring.eurder.order_managment_app.eurder.dto;

import org.spring.eurder.order_managment_app.eurder.model.ItemGroup;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class ItemGroupMapper {

    public ItemGroup mapToItemGroup(ItemGroupDTO itemGroupDTO) {
        return new ItemGroup(
                itemGroupDTO.getItemId(),
                itemGroupDTO.getAmount()
        );
    }

    public Collection<ItemGroup> collectionMapToItemGroup(Collection<ItemGroupDTO> itemGroupDTOs) {
        return itemGroupDTOs.stream()
                .map(this::mapToItemGroup)
                .collect(Collectors.toList());
    }
    public ItemGroupDTO mapToDto(ItemGroup itemGroup) {
        return new ItemGroupDTO(
            itemGroup.getItemId(),
            itemGroup.getAmount(),
            itemGroup.getShippingDate()
        );
    }

    public Collection<ItemGroupDTO> collectionMapToDto(Collection<ItemGroup> itemGroups) {
        return itemGroups.stream()
                .map(this::mapToDto)
                .collect(Collectors.toList());
    }



}
