package com.tcet.tc_spring.service;

import com.tcet.tc_spring.domain.Employee;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface EmployeeService {
    List<Employee> list();

    void save(Employee employee);

    @Transactional
    void update(Employee user);

    void delete(Integer id);

    @Transactional(readOnly = true)
    Employee getEmployee(Integer id);
}
