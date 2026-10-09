package com.example.tut1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {
    @GetMapping("/home")
    public String home () {
        return "Welcome to Home";

    }


        @GetMapping("/info")
        public String info () {
            return "version 2.0.2";
        }





}
