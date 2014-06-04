package com.gilesc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class PizzaDAO {
    @Autowired
    DataSource dataSource;

    @Autowired
    SessionFactory sessionFactory;

    @Transactional
    public List<Pizza> getAll() {
        Session session = sessionFactory.getCurrentSession();
        List<Pizza> newPizzas = session.createQuery("from Pizza ").list();
        return newPizzas;
    }
}
