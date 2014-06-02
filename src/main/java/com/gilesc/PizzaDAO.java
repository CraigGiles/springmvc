package com.gilesc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class PizzaDAO {
    @Autowired
    DataSource dataSource;

    @Transactional
    public List<Pizza> getAll() {
        List pizzas = new ArrayList<Pizza>();
        String sql = "SELECT * FROM pizza";
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        pizzas = jdbcTemplate.query(sql, new PizzaRowMapper());

        return pizzas;
    }
}
