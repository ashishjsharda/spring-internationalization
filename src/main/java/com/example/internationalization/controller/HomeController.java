package com.example.internationalization.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Locale;

@Controller
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private MessageSource messageSource;

    @GetMapping
    public String home(Locale locale, Model model) {
        model.addAttribute("title", messageSource.getMessage("title", null, locale));
        model.addAttribute("message", messageSource.getMessage("message", null, locale));
        return "home";

    }
}
