package com.gilesc.dataaccess.hibernate;

import com.gilesc.dataaccess.UserDAO;
import com.gilesc.domain.Address;
import com.gilesc.domain.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.util.List;

public class UserHB implements UserDAO {
    @Autowired
    DataSource dataSource;

    @Autowired
    SessionFactory sessionFactory;

    @Override
    @Transactional
    public void save(User user) {
        this.sessionFactory.getCurrentSession().save(user);
    }

    @Override
    @Transactional
    public User findByUsername(String username) {
        Session session = this.sessionFactory.getCurrentSession();
        return (User)session.createCriteria( User.class ).
                add( Restrictions.eq("username", username) ).
                uniqueResult();
    }
}
