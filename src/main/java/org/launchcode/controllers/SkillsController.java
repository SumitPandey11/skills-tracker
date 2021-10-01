package org.launchcode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


public class SkillsController {

    @GetMapping
    @ResponseBody
    public String hello(){
        return "Welcome ...";
    }

    @GetMapping("error")
    @ResponseBody
    public String err(){
        return "Error ...";
    }

}
