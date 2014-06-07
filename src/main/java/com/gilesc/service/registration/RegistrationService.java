package com.gilesc.service.registration;

import com.gilesc.dataaccess.UserDAO;
import com.gilesc.domain.Address;
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
            Address address = new Address(
                    information.getStreet(),
                    information.getCity(),
                    information.getState(),
                    information.getZipcode()
            );

            User user = new User(
                    information.getUsername(),
                    information.getPassword(),
                    information.getEmail(),
                    address);

            userDAO.save(user);
        } catch (ConstraintViolationException ex) {
//            String msg = (ex.getConstraintName().equals("username")) ? "A user with this username already exists." : "A user with this email already exists.";
            String msg = ex.getSQLException().getMessage();
            throw new RegistrationException(msg);
        }
    }
}
