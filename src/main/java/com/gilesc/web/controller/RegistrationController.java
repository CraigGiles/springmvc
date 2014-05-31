package com.gilesc.web.controller;

import com.gilesc.service.registration.RegistrationService;
import com.gilesc.web.form.RegistrationForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping("/registration")
public class RegistrationController {
    private RegistrationService registration;
    private Validator validator;

    @RequestMapping(method = RequestMethod.GET, value = "")
    public ModelAndView index() {
        return new ModelAndView("registration/registration", "registration", new RegistrationForm());
    }

    @RequestMapping(method = RequestMethod.POST, value = "")
    public String register(@Valid @ModelAttribute("registration") RegistrationForm form, BindingResult result) {
        String returnValue = null;

        validator.validate(form, result);
        if (result.hasErrors()) {
            returnValue = "registration/registration";
        } else {
            returnValue = "redirect:/";
        }

        return returnValue;
    }

    @Autowired
    public void setRegistrationService(RegistrationService registration) {
        this.registration = registration;
    }

    @Autowired
    public void setValidator(Validator validator) {
        this.validator = validator;
    }
}
