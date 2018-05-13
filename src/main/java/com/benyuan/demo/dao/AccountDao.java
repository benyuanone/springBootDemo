package com.benyuan.demo.dao;

import com.benyuan.demo.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by D.chen.g on 2018/5/13.
 */
public interface AccountDao extends JpaRepository<Account,Integer> {
}
