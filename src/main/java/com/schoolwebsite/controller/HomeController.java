package com.schoolwebsite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("title", "Welcome to Little Flower School");
        return "home";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "About Little Flower School");
        return "about";
    }

    @GetMapping("/contact")
    public String contact(Model model) {
        model.addAttribute("title", "Contact Little Flower School");
        return "contact";
    }

    @GetMapping("/students")
    public String students(Model model) {
        model.addAttribute("title", "Students - Little Flower School");
        return "students";
    }
}
