package com.tcet.tc_spring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {

    @Autowired
    LoginService loginService;

    public Boolean validate(String user, String pass){
        return loginService.auth(user,pass);
    }

}
