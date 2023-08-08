package com.in28minutes.rest.webservices.limitesservices.controller;

import com.in28minutes.rest.webservices.limitesservices.bean.Limits;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitController {

    @GetMapping("/limits")
    public Limits retrieveLimits(){
        return new Limits(1,1000);
    }
}
