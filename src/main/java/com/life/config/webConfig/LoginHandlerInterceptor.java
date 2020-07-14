package com.life.config.webConfig;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 登录拦截器
 * 使用session判定当前是否登录，若未登录（session的username为空），则跳转至登录页
 */
public class LoginHandlerInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String username = (String) request.getSession().getAttribute("username");   // 获取session中的username
        if (username == null){          // 未登录
            request.setAttribute("msg", "尚未登录，请先登录");
            request.getRequestDispatcher("/").forward(request, response);  // 重定向到登录页
            return false;
        } else {
            return true;
        }
    }
}
