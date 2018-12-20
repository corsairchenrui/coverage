package com.example.module1;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AController {
    @PostMapping
    public String get(@RequestBody Input input) {

        return "111";
    }
}
