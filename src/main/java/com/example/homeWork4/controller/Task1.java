package com.example.homeWork4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Task1 {
    @RequestMapping ("/task1")
    public String hello() {
        return "task1";
    }
}
