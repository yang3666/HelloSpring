package com.jy.dao.impl;

import com.jy.dao.AccountDao;
import com.jy.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public class AccountDaoImpl implements AccountDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Account selectByUserId(String userId) {
        String sql = "  select * from account where user_id = ?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Account>(Account.class), userId);
    }

    @Override
    public int decrease(String userId, BigDecimal money) {
        String sql = "UPDATE account SET residue = residue - ?, used = used + ? WHERE user_id = ?;";
        return jdbcTemplate.update(sql, money, money, userId);
    }
}
