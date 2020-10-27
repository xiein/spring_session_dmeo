package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @Author 信仰
 * @Date 2020/10/27 20:47
 * @Description : 分布式中SpringSession的使用
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/save")
    public String save(HttpServletRequest request){
        HttpSession session = request.getSession();
        session.setAttribute("test", "Hello SpringSession");
        return "success";
    }

    @RequestMapping("/getMessage")
    public String getMessage(HttpServletRequest request){
        HttpSession session = request.getSession();
        String message = (String) session.getAttribute("test");
        return message;
    }
}
