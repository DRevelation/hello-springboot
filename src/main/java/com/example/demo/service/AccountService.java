package com.example.demo.service;

import com.example.demo.domain.Account;

import java.util.List;

/**
 * @Auther DRevelation
 * @Date 2019-06-12 17:09
 * @Desc
 */
public interface AccountService {

    int add(Account account);

    int update(Account account);

    int delete(int id);

    Account findAccountById(int id);

    List<Account> findAccountList();

}
