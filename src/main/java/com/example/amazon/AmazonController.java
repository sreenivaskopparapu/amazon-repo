package com.example.amazon;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AmazonController {

    @GetMapping("/welcome")
    public String show(){
        return "welcome to Amazon factory";
    }
}
