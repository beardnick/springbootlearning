package com.example.springbootlearning.domain.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Account implements Serializable {

    private static final Long serialVersion = 1L;
    @GeneratedValue
    @Id
    private Long account;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String name;

    public Account(String password, String name) {
        this.password = password;
        this.name = name;
    }

    public Long getAccount() {
        return account;
    }

    public void setAccount(Long account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
