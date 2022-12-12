package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConvertController {
    @GetMapping({"/home", "/"})
    public String home() {
        return "homepage";
    }

    @GetMapping("/convert")
    public String convert(@RequestParam float amount, Model model) {
        float result = amount * 22000;
        model.addAttribute("result", result);
        return "result";
    }
}
