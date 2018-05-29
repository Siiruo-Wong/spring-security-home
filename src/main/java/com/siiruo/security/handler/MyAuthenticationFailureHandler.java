package com.siiruo.security.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by siiruo on 2018/5/23.
 */
@Component
public class MyAuthenticationFailureHandler implements AuthenticationFailureHandler{
    @Autowired
    List<BaseMyAuthenticationFailureHandler> handlers;
    @Override
    public void onAuthenticationFailure(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {
        if (this.handlers!=null&&this.handlers.size()>0) {
            for (BaseMyAuthenticationFailureHandler handler : this.handlers) {
                handler.onAuthenticationFailure(httpServletRequest, httpServletResponse, e);
            }
        }
        httpServletResponse.sendRedirect("error.jsp");
    }
}
