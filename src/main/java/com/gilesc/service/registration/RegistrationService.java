package com.gilesc.service.registration;

import com.gilesc.web.registration.RegistrationForm;

public class RegistrationService {
    public boolean register(RegistrationForm contact) throws RegistrationException {
        throw new RegistrationException("Testing registration exception handling");
    }
}
