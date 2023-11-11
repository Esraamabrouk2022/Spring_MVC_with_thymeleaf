package com.luv2code.springboot.Thymeleaf.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Locale;

@Controller
public class HelloWorldController {

    @GetMapping("/showForm")
    public String showForm() {

        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    @RequestMapping("/processFormVersion2")
    public String letshoutDude(HttpServletRequest request, Model model) {

        String name = request.getParameter("studentName");
        name = name.toUpperCase();
        String result = "yo! " + name;
        model.addAttribute("message", result);

        return "helloworld";
    }

    @GetMapping("/processFormVersion3")
    public String processformversion3(@RequestParam("studentName") String name, Model model) {

        name = name.toUpperCase();
        String result = "Hi my friend " + name;
        model.addAttribute("message", result);

        return "helloworld";
    }




}
