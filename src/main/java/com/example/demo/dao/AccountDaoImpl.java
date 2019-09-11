package com.example.demo.dao;

import com.example.demo.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Auther DRevelation
 * @Date 2019-06-12 16:59
 * @Desc
 */
@Repository
public class AccountDaoImpl implements AccountDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int add(Account account) {
        return jdbcTemplate.update("insert into account(name, money) value (?, ?)",
                account.getName(), account.getMoney());
    }

    @Override
    public int update(Account account) {
        return jdbcTemplate.update("update account set name=?, money=? where id=?",
                account.getName(), account.getMoney(), account.getId());
    }

    @Override
    public int delete(int id) {
        return jdbcTemplate.update("delete from account where id=?", id);
    }

    @Override
    public Account findAccountById(int id) {
        List<Account> list = jdbcTemplate.query("select * from account where id=?", new Object[]{id}, new BeanPropertyRowMapper<>(Account.class));
        if (list != null && list.size() > 0) {
            Account account = list.get(0);
            return account;
        } else {
            return null;
        }
    }

    @Override
    public List<Account> findAccountList() {
//        List<Account> list = jdbcTemplate.queryForList("select * from account", Account.class); //error
        List<Account> list = jdbcTemplate.query("select * from account", new Object[]{}, new BeanPropertyRowMapper<>(Account.class));
        if (list != null && list.size() > 0) {
            return list;
        } else {
            return null;
        }
    }
}
