package com.tcet.tc_spring.service;

import com.tcet.tc_spring.dao.EmployeeDao;
import com.tcet.tc_spring.domain.Employee;
import com.tcet.tc_spring.domain.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class LoginServiceImpl implements LoginService {

    @Autowired
    EmployeeDao employeeDao;

    @Override
    @Transactional(readOnly = true)
    public Employee authenticate(Login login) {
        return employeeDao.authenticate(login);
    }
}
