package com.example.demo.dao;

import com.example.demo.domain.Account;

import java.util.List;

/**
 * @Auther DRevelation
 * @Date 2019-06-12 16:57
 * @Desc
 */
public interface AccountDao {

    int add(Account account);

    int update(Account account);

    int delete(int id);

    Account findAccountById(int id);

    List<Account> findAccountList();

}
