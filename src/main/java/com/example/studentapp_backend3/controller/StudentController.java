package com.example.studentapp_backend3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class StudentController {

    @GetMapping("/")
    public String Homepage(){
        return "Welcome to my website";
    }

    @GetMapping("/contact")
    public String Contactpage(){
        return "You are now in contact page";
    }

    @GetMapping("/gallery")
    public String Gallerypage(){
        return "You are now in  Gallery page";
    }

    @GetMapping("/homepage2")
    public String Homepage2(){
        return "You are now in Home page 2";
    }

}
