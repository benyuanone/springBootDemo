package com.benyuan.demo.service;

import com.benyuan.demo.entity.Account;

import java.util.List;

/**
 * Created by D.chen.g on 2018/5/13.
 */
public interface IAccountService {
    int add(Account account);

    int update(Account account);

    int delete(int id);

    Account findAccountById(int id);

    List<Account> findAccountList();
}
