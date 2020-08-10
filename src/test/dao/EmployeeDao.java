package com.tcet.tc_spring.dao;

import com.tcet.tc_spring.domain.Employee;
import com.tcet.tc_spring.domain.Login;

import java.util.List;

public interface EmployeeDao {
    void save(Employee employee);

    List<Employee> list();

    Employee getEmployee(Integer id);

    void delete(Integer id);

    void update(Employee employee);

    Employee authenticate(Login login);
}
