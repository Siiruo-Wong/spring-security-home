package com.siiruo.security.handler;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by siiruo on 2018/5/23.
 */
@Component
public class SubMyAuthenticationSuccessHandler01 implements BaseMyAuthenticationSuccessHandler {
    public SubMyAuthenticationSuccessHandler01() {
        System.out.println("constructor 01");
    }

    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) {
        System.out.println(this.getClass().getName());
    }
}
