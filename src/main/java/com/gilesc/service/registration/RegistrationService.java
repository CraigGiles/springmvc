package com.gilesc.service.registration;

import com.gilesc.dataaccess.UserDAO;
import com.gilesc.domain.User;
import org.springframework.beans.factory.annotation.Autowired;

public class RegistrationService {
    private UserDAO userDAO;

    @Autowired
    public RegistrationService(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public boolean register(RegistrationInformation information) throws RegistrationException {
        User user = new User(
                information.getUsername(),
                information.getPassword(),
                information.getEmail());

        try {
            userDAO.save(user);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
