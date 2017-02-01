package com.pluralsight.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by dev on 01/02/17.
 */
@Controller
public class LoginController {

    @RequestMapping (value = "/login", method = RequestMethod.GET)
    public String login(Model model){
        System.out.println("In the login method");
        return "login";
    }

    @RequestMapping(value = "/logingFailed", method = RequestMethod.GET)
    public String loginFailed(Model model){
        System.out.println("Login Failed");

        model.addAttribute("error", "true");
        return "login";
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(Model model){
        return "logout";
    }

    @RequestMapping(value = "/403", method = RequestMethod.GET)
    public String error403(Model model){
        return "403";
    }

}
