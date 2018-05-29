package com.siiruo.security.handler;

import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by siiruo on 2018/5/23.
 */
@Component
public class SubMyAuthenticationFailureHandler01 implements BaseMyAuthenticationFailureHandler{
    @Override
    public void onAuthenticationFailure(HttpServletRequest var1, HttpServletResponse var2, AuthenticationException var3) throws IOException, ServletException {
        System.out.println(this.getClass().getName());
    }
}
