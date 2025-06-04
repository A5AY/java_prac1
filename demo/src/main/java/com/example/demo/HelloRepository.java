package com.example.demo;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class HelloRepository {
    
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Map<String, Object> findById(String id) {
        String sql = "SELECT * "+
                     "FROM employee " +
                     "WHERE id = ?";

                     Map<String, Object> employee = jdbcTemplate.queryForMap(sql, id);
        return employee;
    }
}
