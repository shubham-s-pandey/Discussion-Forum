package com.tcet.tc_spring.filter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//@WebFilter("/*")
public class SessionFilter implements Filter {

    List<String> loginUrls = Arrays.asList("/login","/authenticate");

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {

        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;
        String url = request.getServletPath();
        boolean allowedRequest = false;
        HttpSession session = request.getSession(false);
        if (session == null || session.getAttribute("username") == null ) { //If session does not exist
            if (loginUrls.contains(url)) {  // if current url is a login url
                chain.doFilter(req, res);  // let them proceed
            } else {
                response.sendRedirect("/login"); //else force them to login url
            }
        } else { // if session exist
            if (!loginUrls.contains(url)) {  // if current url is not a login url
                chain.doFilter(req, res); // let them proceed
            } else {
                response.sendRedirect("/"); //force them back to application
            }
        }
//        chain.doFilter(req, res);  // let them proceed

    }

    @Override
    public void destroy() {

    }
}
