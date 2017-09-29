package com.stuartmathews.controllers;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller
@RequestMapping("/about")
public class AboutController
{ 
    // Default get method
    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap model)
    {

            model.addAttribute("message", "Welcome to the about page");
            return "About";
    }
 
}