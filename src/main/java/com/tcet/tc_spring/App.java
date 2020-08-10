package com.tcet.tc_spring;

import com.tcet.tc_spring.domain.Topic;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
        Employee e1 = applicationContext.getBean(Employee.class);
        Topic t1 = applicationContext.getBean(Topic.class);
        System.out.println(e1.validate("admin","admin123"));
        System.out.println(e1.validate("admin","12341234"));

        }
}
