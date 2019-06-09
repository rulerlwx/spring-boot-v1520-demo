package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * Created by lwx on 2019/6/9.
 */
@Controller
public class LoginController {

    @PostMapping("/user/login")
    public String login(String username, String password, Map map, HttpSession session){
        if(!StringUtils.isEmpty(username) && "666".equals(password)){
            session.setAttribute("loginUser",username);
            return "redirect:/main.html";
        }else {
            map.put("msg", "用户名密码错误");
            return "login";
        }
    }
}
