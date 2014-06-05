package com.gilesc.web.registration;

import com.gilesc.service.registration.RegistrationInformation;
import org.hibernate.validator.constraints.*;

public class RegistrationForm implements RegistrationInformation {
    @Length(min=5, max=100)
    @NotEmpty
    private String username;

    @Length(min=8, max=100)
    @NotEmpty
    private String password;

    @Length(min=8, max=100)
    @NotEmpty
    private String password_confirmation;

    @Email
    @NotEmpty
    private String email;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword_confirmation() {
        return password_confirmation;
    }

    public void setPassword_confirmation(String password_confirmation) {
        this.password_confirmation = password_confirmation;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
