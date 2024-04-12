package org.spring.eurder.order_managment_app.eurder.service;

import org.spring.eurder.order_managment_app.eurder.dto.CreateEurderDTO;
import org.spring.eurder.order_managment_app.eurder.dto.EurderDTO;
import org.spring.eurder.order_managment_app.eurder.dto.EurderMapper;
import org.spring.eurder.order_managment_app.eurder.model.Eurder;
import org.spring.eurder.order_managment_app.eurder.model.EurderRepository;
import org.springframework.stereotype.Service;

@Service
public class EurderService {
    private EurderRepository eurderRepository;
    private EurderMapper eurderMapper;

    public EurderService(EurderRepository eurderRepository, EurderMapper eurderMapper) {
        this.eurderRepository = eurderRepository;
        this.eurderMapper = eurderMapper;
    }

    public EurderDTO createEurder(CreateEurderDTO createEurderDTO) {
        Eurder eurder = eurderMapper.mapToEurder(createEurderDTO);
        Eurder savedEurder = eurderRepository.addEurder(eurder);
        return eurderMapper.mapToDto(savedEurder);
    }
}
