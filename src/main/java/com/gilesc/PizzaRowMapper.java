package com.gilesc;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PizzaRowMapper implements RowMapper<Pizza> {

    @Override
    public Pizza mapRow(ResultSet resultSet, int line) throws SQLException {
        PizzaExtractor userExtractor = new PizzaExtractor();
        return userExtractor.extractData(resultSet);
    }

}
