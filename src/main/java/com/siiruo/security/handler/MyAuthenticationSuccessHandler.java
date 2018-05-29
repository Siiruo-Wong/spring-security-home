package com.siiruo.security.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * 当使用基于XML文件方式的spring security 时，如果需要自己指定认证成功处理器的话，
 * 则需要把MyAuthenticationSuccessHandler手动配置在XML文件中。
 *
 * 此处使用@Component主要的作用是将所有的BaseMyAuthenticationHandler实现类使用注解的方式（简洁）
 * 注入到handlers。
 *
 * 其实，当XML和注解的方式同时存在时，那么注解会优先执行，而XML的方式会后续执行，
 * 所以当前bean的属性会被XML的方式覆盖（前提是存在属性注入的配置，如果没有也不会被覆盖的）。
 *
 * 本处理器就是利用上述逻辑，先注入属性，然后将当前bean以XML的方式（不得已而为之）注入到form-login标签里，
 * 之所以handlers没有被覆盖，是因为我们的XML的配置方式没有指定handlers的属性设置。
 *
 * 后来的版本，也可以直接把@Component去掉
 *
 * Created by siiruo on 2018/5/23.
 */
//@Component
public class MyAuthenticationSuccessHandler implements AuthenticationSuccessHandler{

    @Autowired
    List<BaseMyAuthenticationSuccessHandler> handlers;

    public MyAuthenticationSuccessHandler() {
        System.out.println("constructor MyAuthenticationSucces");
    }

    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
        if(handlers!=null&&handlers.size()>0){
            for (BaseMyAuthenticationSuccessHandler handler : handlers) {
                handler.onAuthenticationSuccess(httpServletRequest,httpServletResponse,authentication);
            }
        }
        httpServletResponse.sendRedirect("success.jsp");
    }
}
