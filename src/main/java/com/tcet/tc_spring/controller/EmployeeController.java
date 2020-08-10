package com.tcet.tc_spring.controller;

import com.tcet.tc_spring.domain.Employee;
import com.tcet.tc_spring.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.Locale;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/emp")
    public String employeeForm(Locale locale, Model model) {
        model.addAttribute("employees", employeeService.list());
        return "editEmployees";
    }

    @ModelAttribute("employee")
    public Employee formBackingObject() {
        return new Employee();
    }

    @PostMapping("/addEmployee")
    public String saveEmployee(@ModelAttribute("employee") @Valid Employee employee,
                           BindingResult result, Model model) {

        if (result.hasErrors()) {
            model.addAttribute("employees", employeeService.list());
            return "editEmployees";
        }

        employeeService.save(employee);
        return "redirect:/emp";
    }

    @PostMapping("/updateEmployee")
    public String updateEmployee(@ModelAttribute("employee") @Valid Employee employee,
                           BindingResult result, Model model) {

        if (result.hasErrors()) {
            model.addAttribute("employees", employeeService.list());
            return "editEmployees";
        }

        employeeService.update(employee);
        return "redirect:/emp";
    }

    @GetMapping("/editEmployee")
    public String updateEmployee(@ModelAttribute("employee") @RequestParam Integer id,
                            Model model) {

        model.addAttribute("employeeEdited", employeeService.getEmployee(id));
        model.addAttribute("employees", employeeService.list());
        return "editEmployees";
    }

    @GetMapping("/deleteEmployee")
    public String deleteEmployee(@ModelAttribute("employee") @RequestParam Integer id) {

        employeeService.delete(id);
        return "redirect:/emp";
    }
}
