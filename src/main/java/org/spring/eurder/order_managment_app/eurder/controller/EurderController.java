package org.spring.eurder.order_managment_app.eurder.controller;

import org.spring.eurder.order_managment_app.eurder.dto.CreateEurderDTO;
import org.spring.eurder.order_managment_app.eurder.dto.EurderDTO;
import org.spring.eurder.order_managment_app.eurder.service.EurderService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class EurderController {
    private EurderService eurderService;

    public EurderController(EurderService eurderService) {
        this.eurderService = eurderService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public EurderDTO placeOrder(@RequestBody CreateEurderDTO createEurderDTO) {
        return eurderService.createEurder(createEurderDTO);
    }
}
