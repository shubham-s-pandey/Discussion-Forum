package com.tcet.tc_spring.service;

import com.tcet.tc_spring.dao.EmployeeDao;
import com.tcet.tc_spring.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;

    @Transactional
    @Override
    public void save(Employee user) {
        employeeDao.save(user);
    }

    @Transactional
    @Override
    public void update(Employee user) {
        employeeDao.update(user);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        employeeDao.delete(id);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Employee> list() {
        return employeeDao.list();
    }

    @Transactional(readOnly = true)
    @Override
    public Employee getEmployee(Integer id) {
        return employeeDao.getEmployee(id);
    }
}
