package com.gilesc.service.registration;

import com.gilesc.web.form.RegistrationForm;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class RegistrationFormValidator implements Validator {
    static final String USERNAME = "username";
    static final String PASSWORD = "password";
    static final String EMAIL = "email";

    @Override
    public boolean supports(Class<?> clazz) {
        return RegistrationForm.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        RegistrationForm form = (RegistrationForm)target;

        validatePassword(form, errors);
        validateUsername(form, errors);
        validateEmail(form, errors);
    }

    /**
     * Email validation requirements:
     * email is required
     * must be of type Email
     * must be unique
     *
     * @param form RegistrationForm to validate
     * @param errors Errors in the registration form
     */
    private void validateEmail(RegistrationForm form, Errors errors) {

    }

    /**
     * Username validation requirements:
     * username is required
     * minimum length is 5 characters
     * username must be unique
     *
     * @param form RegistrationForm to validate
     * @param errors Errors in the registration form
     */
    private void validateUsername(RegistrationForm form, Errors errors) {

    }

    /**
     * Password validation:
     * Password is required
     * Password must be confirmed
     * Password minimum length must be 8 characters
     *
     * @param form RegistrationForm to validate
     * @param errors Errors in the registration form
     */
    private void validatePassword(RegistrationForm form, Errors errors) {
        String password = form.getPassword();
        String password_confirmation = form.getPassword_confirmation();

        if (!password.equals(password_confirmation)) {
            errors.rejectValue(PASSWORD, "400", "password and confirmation must match.");
        }
    }
}
