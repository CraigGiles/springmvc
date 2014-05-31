package com.gilesc.web.validation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

abstract public class FormValidator implements Validator {
    private Validator validator;

    @Override
    public void validate(Object target, Errors errors) {
        this.validator.validate(target, errors);
    }

    @Autowired
    public void setValidator(Validator validator) {
        this.validator = validator;
    }
}
