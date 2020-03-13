package io.pivotal.pal.tracker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController{
private String message="hello";

    @GetMapping("/")
    public String sayHello(){
        return message;
    }
}

