package demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
    @RequestMapping("/")
    public ModelAndView home(){
        return new ModelAndView("login");
    }
    @RequestMapping("/login")
    public ModelAndView login(){
        return new ModelAndView("login");
    }
}
