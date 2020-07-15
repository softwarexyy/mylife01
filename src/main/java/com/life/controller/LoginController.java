package com.life.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @RequestMapping("/userlogin")
    public String userLogin(Model model, @RequestParam("loginname") String loginname, @RequestParam("password") String password, HttpSession session) {
        // todo：验证密码是否正确
        if (loginname.equals("abc") && password.equals("123")) {
            session.setAttribute("username", loginname);    // 设置session
            return "redirect:/toIndex";     // 跳转到另外一个controller，防止登录后把用户名和密码带在url上
        } else {
            model.addAttribute("msg", "用户名或密码错误");
            return "login";
        }
    }

    /**
     * 用户注销
     */
    @RequestMapping("/userlogout")
    public String userLogout(HttpSession session) {
        session.invalidate();
        return "login";
    }

}
