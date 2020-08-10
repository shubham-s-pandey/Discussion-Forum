package com.tcet.tc_spring.controller;

import com.tcet.tc_spring.domain.Employee;
import com.tcet.tc_spring.domain.Login;
import com.tcet.tc_spring.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/logout")
    public String logout(HttpServletRequest request) {
        request.getSession().invalidate();
        return "redirect:/login";
    }

    @PostMapping("/authenticate")
    public String authenticate(HttpServletRequest request, @ModelAttribute @Valid Login login) {

        Employee employee = loginService.authenticate(login);
        if(employee==null){
            return "redirect:/login";
        }else{
            HttpSession session = request.getSession();
            session.setAttribute("name", new StringBuilder().append(employee.getFirstName()).append(" ").append(employee.getLastName()).toString());
            session.setAttribute("username",employee.getUsername());
            session.setAttribute("userId",employee.getId());
        }
        return "redirect:/";
    }

    @ModelAttribute("login")
    public Login formBackingObject() {
        return new Login();
    }

}
