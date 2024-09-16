package com.zainab.web1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Test1Controller {

    @GetMapping("/web1")
    @ResponseBody
    public String printSth(){
        return "Hey this is my first test of Spring boot web application";
    }

    @GetMapping("/tem")
    public String printTem(Model tem){
     tem.addAttribute("msg1", "Hello World from the model");
     tem.addAttribute("msg2", "this is the msg 2 of the template");

        return "web1.html"; //writing .html is optional
    }


}
