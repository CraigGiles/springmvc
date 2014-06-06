package com.gilesc.web.registration;

import com.gilesc.service.registration.RegistrationException;
import com.gilesc.service.registration.RegistrationService;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
@RequestMapping("/registration")
public class RegistrationController {
    private RegistrationForm form;
    private RegistrationService registration;
    private RegistrationFormValidator validator;

    @RequestMapping(method = RequestMethod.GET, value = "")
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("registration/registration", "registration", new RegistrationForm());
        return mv;
    }

    @RequestMapping(method = RequestMethod.POST, value = "")
    public String register(@Valid @ModelAttribute("registration") RegistrationForm form, BindingResult result) throws RegistrationException {
        validator.validate(form, result);

        if (result.hasErrors()) {
            return "registration/registration";
        } else {
            this.form = form;
            registration.register(form);
            return "registration/registration";
        }
    }

    @Autowired
    public void setRegistrationService(RegistrationService registration) {
        this.registration = registration;
    }

    @Autowired
    public void setValidator(RegistrationFormValidator validator) {
        this.validator = validator;
    }

    @ExceptionHandler(RegistrationException.class)
    public ModelAndView handleError(HttpServletRequest req, Exception exception) {
        ModelAndView mav = new ModelAndView();

        mav.addObject("exception", exception.getMessage());
        mav.addObject("url", req.getRequestURL());
        mav.addObject("registration", form);
        mav.setViewName("registration/registration");

        return mav;
    }
}
