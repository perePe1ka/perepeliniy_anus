package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class testContr {

    @GetMapping("/helloEblan")
    @ResponseBody
    public String helloWorld() {
        return "Hello, world!";
    }

}
