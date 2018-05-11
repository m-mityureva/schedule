package vsu.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class ScheduleController {
    @RequestMapping(value = {"/schedule"}, method = RequestMethod.GET)
    public String index(){
        return "login";
    }
}
