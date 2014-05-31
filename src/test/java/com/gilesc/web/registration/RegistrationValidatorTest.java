package com.gilesc.web.registration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;
import org.springframework.validation.Errors;

@RunWith(JUnit4.class)
public class RegistrationValidatorTest {
    private RegistrationFormValidator validator;
    private RegistrationForm form;
    private Errors errors;

    @Before
    public void setUp() throws Exception {
        this.validator = new RegistrationFormValidator();
        this.form = new RegistrationForm();
        this.errors = Mockito.mock(Errors.class);
    }

    @Test
    public void it_must_match_password_and_password_confirmation() {
        form.setPassword("asdf");
        validator.validate(form, errors);
        Mockito.verify(errors).rejectValue("password", "400", "password and confirmation must match.");
    }
}
