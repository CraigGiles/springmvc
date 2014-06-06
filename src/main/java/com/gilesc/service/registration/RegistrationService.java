package com.gilesc.service.registration;

import com.gilesc.dataaccess.UserDAO;
import com.gilesc.domain.User;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;

public class RegistrationService {
    private UserDAO userDAO;

    @Autowired
    public RegistrationService(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public void register(RegistrationInformation information) throws RegistrationException {
        try {
            User user = new User(
                    information.getUsername(),
                    information.getPassword(),
                    information.getEmail());

            userDAO.save(user);
        } catch (ConstraintViolationException ex) {
            String msg = (ex.getConstraintName().equals("username")) ? "A user with this username already exists." : "A user with this email already exists.";
            throw new RegistrationException(msg);
        }
    }
}
