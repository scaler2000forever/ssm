package com.atlinlin.test;

import com.atlinlin.dao.AccountDao;
import com.atlinlin.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @ author : LiLin
 * @ create : 2022-04-24 15:46
 */
public class TestMyBatis {
    /**
     * 测试查询
     */
    @Test
    public void run(){
        //加载配置文件
        try {
            InputStream rs = Resources.getResourceAsStream("SqlMapConfig.xml");
            //创建sqlSessionFactory对象
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(rs);
            //创建sqlSession对象
            SqlSession sqlSession = sqlSessionFactory.openSession(true);
            //获取代理对象
            AccountDao mapper = sqlSession.getMapper(AccountDao.class);
            List<Account> list = mapper.findAll();
            for (Account account:
                 list) {
                System.out.println(account);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 测试保存
     */
    @Test
    public void run2(){
        Account account = new Account();
        account.setName("费费");
        account.setMoney(300d);
        //加载配置文件
        try {
            InputStream rs = Resources.getResourceAsStream("SqlMapConfig.xml");
            //创建sqlSessionFactory对象
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(rs);
            //创建sqlSession对象
            SqlSession sqlSession = sqlSessionFactory.openSession(true);
            //获取代理对象
            AccountDao mapper = sqlSession.getMapper(AccountDao.class);
            mapper.saveAccount(account);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
