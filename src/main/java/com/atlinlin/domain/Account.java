package com.atlinlin.domain;

/**
 * @ author : LiLin
 * @ create : 2022-04-24 10:50
 */

import java.io.Serializable;

/**
 * 账户信息
 */
public class Account implements Serializable {
    private Integer id;

    private String name;

    private Double money;

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
}
