package com.luv2code.springboot.Thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("/hello")
    public String SayHello(Model model){
        model.addAttribute("theDate",new java.util.Date());
        return "helloworld";
    }
}
