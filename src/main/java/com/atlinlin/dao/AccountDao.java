package com.atlinlin.dao;

import com.atlinlin.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ author : LiLin
 * @ create : 2022-04-24 11:10
 */

/**
 * 账户dao接口
 */
@Repository
public interface AccountDao {

//    查询所有账户
    @Select("select * from account")
    public List<Account> findAll();

//    保存账户信息
    @Insert("insert into account (name,money) values (#{name},#{money})")
    public void saveAccount(Account account);
}
