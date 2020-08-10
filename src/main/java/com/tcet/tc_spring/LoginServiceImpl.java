package com.tcet.tc_spring;

public class LoginServiceImpl implements LoginService {
    @Override
    public Boolean auth(String user, String pass) {
        if(user!=null && pass!=null&& user.equals("admin") && pass.equals("admin123")){
            return true;
        }else{
            return false;
        }
    }
}
