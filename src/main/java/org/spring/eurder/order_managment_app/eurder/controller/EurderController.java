package org.spring.eurder.order_managment_app.eurder.controller;

import org.spring.eurder.order_managment_app.eurder.service.EurderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class EurderController {
    private EurderService eurderService;

    public EurderController(EurderService eurderService) {
        this.eurderService = eurderService;
    }
}
