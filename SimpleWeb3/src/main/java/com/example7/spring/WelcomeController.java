package com.example7.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

    @RequestMapping(value = "/welcome")
    public ModelAndView welcome(ModelMap modelMap){
        modelMap.addAttribute("message", "Welcome home");
        modelMap.addAttribute("phone","123-123");
        modelMap.addAttribute("email","asdf@test.com");
        return new ModelAndView("welcome",modelMap);


    }

    @RequestMapping(value = "/sample", method = RequestMethod.GET)
    @ResponseBody
    public String sample(){
        return "Sample string for Unit test";
    }

}

