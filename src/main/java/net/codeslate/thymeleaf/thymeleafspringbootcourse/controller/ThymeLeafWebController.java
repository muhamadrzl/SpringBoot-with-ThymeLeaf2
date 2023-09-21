package net.codeslate.thymeleaf.thymeleafspringbootcourse.controller;

import net.codeslate.thymeleaf.thymeleafspringbootcourse.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
public class ThymeLeafWebController {
//    public Employee employee;
    @GetMapping({"/", "index"})
    public String getIndex(Model model){
        model.addAttribute("allDepartment", List.of("Finance", "Research", "Sales","Operations"));
        model.addAttribute("employee", new Employee());
        return "index";
    }

    @PostMapping("/employee")
    public String addEmployee(@Valid Employee employee, Model model, BindingResult bindingResult){
        System.out.println(employee);

        boolean thereAreErrors=bindingResult.hasErrors();
        if (thereAreErrors){
            model.addAttribute("employee", employee);
            return "index";
        }
        return "Success";
    }


}
