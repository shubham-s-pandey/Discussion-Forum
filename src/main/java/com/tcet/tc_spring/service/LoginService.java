package com.tcet.tc_spring.service;

import com.tcet.tc_spring.domain.Employee;
import com.tcet.tc_spring.domain.Login;

public interface LoginService {
    Employee authenticate(Login login);
}
