package com.gilesc.dataaccess.hibernate;

import com.gilesc.dataaccess.AddressDAO;
import com.gilesc.domain.Address;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;
import javax.transaction.Transactional;

public class AddressHB implements AddressDAO {
    @Autowired
    DataSource dataSource;

    @Autowired
    SessionFactory sessionFactory;

    @Override
    @Transactional
    public void save(Address address) {
        this.sessionFactory.getCurrentSession().save(address);
    }
}
