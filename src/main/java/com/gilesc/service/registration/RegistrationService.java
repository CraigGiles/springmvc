package com.gilesc.service.registration;

import com.gilesc.web.registration.RegistrationForm;

public class RegistrationService {
    public boolean register(RegistrationForm contact) {
        System.out.println("Trying to register" + contact.getUsername());
        return true;
    }
}
