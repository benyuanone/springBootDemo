package com.benyuan.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

/**
 * Created by D.chen.g on 2018/5/13.
 */
@Entity
public class Account {
    @Id
    @GeneratedValue
    private int owid ;
    private String name ;
    private double money;
    private double memos;
    @Transient
    private double memoss;

    public int getId() {
        return owid;
    }

    public void setId(int owid) {
        this.owid = owid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
    @Override
    public String toString() {
        return "Account{" +
                "id=" + owid +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }



    public double getMemoss() {
        return memoss;
    }

    public void setMemoss(double memoss) {
        this.memoss = memoss;
    }

    public double getMemos() {
        return memos;
    }

    public void setMemos(double memos) {
        this.memos = memos;
    }
}
