package com.hk3t.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
    @GetMapping("/")
    public ModelAndView homepage() {
        ModelAndView modelAndView = new ModelAndView("homepage");
//        modelAndView.addObject("page", );
        return modelAndView;
    }
}
