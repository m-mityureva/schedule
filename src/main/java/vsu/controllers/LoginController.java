package vsu.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/login")
public class LoginController {
    //@RequestMapping(value = {"/"}, method = RequestMethod.GET)
    public String login(){
        return "default";
    }

    @RequestMapping(value = {""}, method = RequestMethod.GET)
    public ModelAndView getLogin(){
        return new ModelAndView("login");
    }

}
