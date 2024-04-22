package com.example.homeWork4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Random;
@Controller
public class Task2 {
    @GetMapping("/random")
    public String getRandom(Model model) {
        Random rnd = new Random();
        int num = rnd.nextInt(50);
        model.addAttribute("number", num);
        //model хранит ключ: (number) и значение (num)
        //а Thymeleaf (находится в templates/random.html) будет брать из model
        // и подставлять в number значение num
        return "random";
    }
}
