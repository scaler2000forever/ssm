package com.atlinlin.service.impl;

import com.atlinlin.dao.AccountDao;
import com.atlinlin.domain.Account;
import com.atlinlin.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ author : LiLin
 * @ create : 2022-04-24 12:46
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    public List<Account> findAll() {
        System.out.println("业务层，查询所有的账户...");
        return accountDao.findAll();
    }


    public void saveAccount(Account account) {
        System.out.println("业务层，保存账户...");
        accountDao.saveAccount(account);
    }
}
