package vsu.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import vsu.data_operations.services.GroupService;

@Controller
@RequestMapping("/schedule")
public class ScheduleController {
    private final GroupService groupService;

    public ScheduleController(GroupService groupService) {
        this.groupService = groupService;
    }

    @GetMapping("/{name}")
    public @ResponseBody
    ModelAndView get(@PathVariable String name, Model model) {
        return new ModelAndView(name);
    }


    @RequestMapping(value = {"/"}, method = RequestMethod.GET)
    public String index(){
        return "login";
    }
}
