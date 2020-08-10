package com.tcet.tc_spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    LoginService loginService(){
        return new LoginServiceImpl();
    }

}
