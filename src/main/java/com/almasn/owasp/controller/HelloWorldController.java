package com.almasn.owasp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.HtmlUtils;
 
@Controller
@RequestMapping("/")
public class HelloWorldController {
 
    @RequestMapping(method = RequestMethod.GET)
    public String sayHello(ModelMap model) {
        model.addAttribute("greeting", "Hello World from Spring 4 MVC");
        return "welcome";
    }
 
    @RequestMapping(value = "/helloagain", method = RequestMethod.GET)
    public String sayHelloAgain(ModelMap model) {
        model.addAttribute("greeting", "Hello World Again, from Spring 4 MVC");
        return "welcome";
    }
 
    @RequestMapping(value = "/jinjection", method = RequestMethod.POST)
    public String injectScript(ModelMap model, @RequestParam String info) {
    	model.addAttribute("greeting", "Send injected script");
    	
    	model.addAttribute("info", info);
    	model.addAttribute("info", HtmlUtils.htmlEscape(info));
    	return "welcome";
    }
    
}