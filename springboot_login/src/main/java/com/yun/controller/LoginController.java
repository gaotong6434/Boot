package com.yun.controller;

import com.yun.entity.User;
import com.yun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
@Controller
public class LoginController {


    @GetMapping("/hello")
    public String hello() {
        System.out.println("123");
        return "123";
    }

    @Autowired
    private UserService userService;



    @RequestMapping("/tologin.action")
    public String index() {
        System.out.println("123");
        return "login";
    }



    @RequestMapping("/login.action")
    public ModelAndView login(User user, HttpServletRequest request, HttpSession session){
        ModelAndView mav = new ModelAndView();
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        user.setUsername(username);
        user.setPassword(password);
        user = this.userService.dologin(user);

        if (user != null){
            session.setAttribute("user",user);
            mav.setViewName("detail");
            return mav;
        } else {
            session.setAttribute("errormsg","账号或密码错误！请重新输入");

        }

        mav.setViewName("login");
        return mav;
    }
}
