package demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AuthController {
    @PostMapping("/dologin")
    public ModelAndView dologin(@RequestParam("username")String username,@RequestParam("password")String password){
        System.out.println(username);
        System.out.println(password);
        return new ModelAndView("index");
    }
}
