package net.codeslate.thymeleaf.thymeleafspringbootcourse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ThymeLeafWebController {
    @GetMapping({"/", "index"})
    public String getIndex(Model model){
        model.addAttribute("message","I love azhar");
        model.addAttribute("description", "I love him since 19 years old");
        return "index";
    }
}
