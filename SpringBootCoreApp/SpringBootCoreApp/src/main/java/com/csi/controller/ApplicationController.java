package com.csi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApplicationController {

    @GetMapping("/sayhello")
    public String sayHello(){
        return "HEllo";
    }
    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to Pune";
    }
    @GetMapping("/address")
    public String address(){
        return "India";
    }

    @GetMapping("/myname")
    public String myName()
    {
        return "Harshad!!!!!!";
    }
// Done from Onkar

    // Akshy P
}
