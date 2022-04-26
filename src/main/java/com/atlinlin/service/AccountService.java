package com.atlinlin.service;

import com.atlinlin.domain.Account;

import java.util.List;

/**
 * @ author : LiLin
 * @ create : 2022-04-24 12:44
 */
public interface AccountService {
    //    查询所有账户
    public List<Account> findAll();

    //    保存账户信息
    public void saveAccount(Account account);
}
