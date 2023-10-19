package com.primeiroprojeto.myFirstWebApi.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping
    public String welcome(){
        return "welcome to my spring boot web API";
    }
}
