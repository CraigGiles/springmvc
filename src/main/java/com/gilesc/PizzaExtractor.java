package com.gilesc;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PizzaExtractor implements ResultSetExtractor<Pizza> {
    public Pizza extractData(ResultSet resultSet) throws SQLException, DataAccessException {
        Pizza pizza = new Pizza();
        pizza.setId(resultSet.getInt("id"));
        pizza.setName(resultSet.getNString("name"));
        pizza.setPrice(resultSet.getDouble("price"));

        return pizza;
    }
}
