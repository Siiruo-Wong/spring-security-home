package com.siiruo.security.handler;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by siiruo on 2018/5/23.
 */
@Component
public class SubMyAuthenticationSuccessHandler02 implements BaseMyAuthenticationSuccessHandler {
    public SubMyAuthenticationSuccessHandler02() {
        System.out.println("constructor 02");
    }

    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) {
        System.out.println(this.getClass().getName());
    }
}
