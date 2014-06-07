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

    @Length(min=4)
    @NotEmpty
    private String street;

    @Length(min=4)
    @NotEmpty
    private String city;

    @Length(min=2, max=2)
    @NotEmpty
    private String state;

    @Length(min=5, max=5)
    @NotEmpty
    private String zipcode;

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

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}
