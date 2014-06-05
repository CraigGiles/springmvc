package com.gilesc.dataaccess.hibernate;

import com.gilesc.dataaccess.UserDAO;
import com.gilesc.domain.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;

public class UserHibernate implements UserDAO {
    @Autowired
    DataSource dataSource;

    @Autowired
    SessionFactory sessionFactory;

    @Override
    @Transactional
    public void save(User user) {
        this.sessionFactory.getCurrentSession().save(user);
    }
}
