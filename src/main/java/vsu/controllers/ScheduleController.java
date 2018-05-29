package vsu.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import vsu.data_operations.services.StudentGroupService;


@Controller
@RequestMapping("/")
public class ScheduleController {
    private final StudentGroupService studentGroupService;

    public ScheduleController(StudentGroupService studentGroupService) {
        this.studentGroupService = studentGroupService;
    }

    @RequestMapping(value = {""}, method = RequestMethod.GET)
    public String getIndex(Model model){
        //ModelAndView model = new ModelAndView("index");

        Iterable<Integer> courses = studentGroupService.getCourseNumbers();

        model.addAttribute("courses", courses);

        return "index";
    }


    //@RequestMapping(value = {"/"}, method = RequestMethod.GET)
    public String index(){
        return "login";
    }
}
