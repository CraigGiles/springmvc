package com.gilesc.web.controller;

import com.gilesc.service.registration.RegistrationService;
import com.gilesc.web.form.Registration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/registration")
public class RegistrationController {
    private RegistrationService registration;

    @RequestMapping(method = RequestMethod.GET, value = "")
    public ModelAndView index() {
        return new ModelAndView("registration/registration", "registration", new Registration());
    }

    @RequestMapping(method = RequestMethod.POST, value = "")
    public String register(@ModelAttribute("registration") Registration contact) {
        if (this.registration.register()) {
            System.out.println("Registered");
        }

        return "redirect:/";
    }

    @Autowired
    public void setRegistrationService(RegistrationService registration) {
        this.registration = registration;
    }
}
