package com.gilesc.dataaccess;

import com.gilesc.domain.User;

public interface UserDAO {
    public void save(User user);
    public User findByUsername(String username);
}
