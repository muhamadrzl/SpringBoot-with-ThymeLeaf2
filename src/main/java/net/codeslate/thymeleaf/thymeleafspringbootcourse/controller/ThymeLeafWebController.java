package net.codeslate.thymeleaf.thymeleafspringbootcourse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ThymeLeafWebController {
    @GetMapping({"/", "index"})
    public String getIndex(Model model){
        model.addAttribute("name", "Ravi");
        model.addAttribute("condition", Boolean.FALSE);
        model.addAttribute("role","manager");
        model.addAttribute("students", List.of("Deny", "Ria", "Yudhi"));
        return "index";
    }
}
