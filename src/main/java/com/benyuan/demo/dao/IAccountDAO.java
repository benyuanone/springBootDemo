package com.benyuan.demo.dao;

import com.benyuan.demo.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by D.chen.g on 2018/5/13.
 */
public interface IAccountDAO  {
    int add(Account account);

    int update(Account account);

    int delete(int id);

    Account findAccountById(int id);

    List<Account> findAccountList();
}
