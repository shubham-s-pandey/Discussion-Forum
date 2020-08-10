package com.tcet.tc_spring.dao;

import com.tcet.tc_spring.domain.Employee;
import com.tcet.tc_spring.domain.Login;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.TypedQuery;
import java.util.List;

@Component
public class EmployeeDaoImpl implements EmployeeDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void save(Employee employee) {
        sessionFactory.getCurrentSession().save(employee);
    }

    @Override
    public List<Employee> list() {
        TypedQuery<Employee> query = sessionFactory.getCurrentSession().createQuery("from Employee");
        return query.getResultList();
    }

    @Override
    public Employee getEmployee(Integer id) {
        TypedQuery<Employee> query = sessionFactory.getCurrentSession().createQuery("from Employee where id=:id");
        query.setParameter("id",id);
        return query.getSingleResult();
    }

    @Override
    public void delete(Integer id) {
        Employee employee = new Employee();
        employee.setId(id);
        sessionFactory.getCurrentSession().delete(employee);

    }

    @Override
    public void update(Employee employee) {
        sessionFactory.getCurrentSession().merge(employee);

    }

    @Override
    public Employee authenticate(Login login) {
        TypedQuery<Employee> query = sessionFactory.getCurrentSession().createQuery("from Employee where username=:username and password=:password");
        query.setParameter("username",login.getUsername());
        query.setParameter("password",login.getPassword());
        List<Employee> employees = query.getResultList();
        if(!employees.isEmpty()){
            return employees.get(0);
        }else{
            return null;
        }
    }
}
