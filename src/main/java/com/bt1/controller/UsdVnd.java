package com.bt1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@Controller
public class UsdVnd {
    @PostMapping("/usd")
    public ModelAndView home(HttpServletRequest request){
        int usd = Integer.parseInt(request.getParameter("usd"));
        ModelAndView modelAndView = new ModelAndView("home");
        long vnd = usd*23194;
        modelAndView.addObject("vnd",vnd);
        modelAndView.addObject("usd",usd);
        return modelAndView;
    }
    @GetMapping("/usd")
    public ModelAndView home1(){
        ModelAndView modelAndView = new ModelAndView("home");
        return modelAndView;
    }

}
