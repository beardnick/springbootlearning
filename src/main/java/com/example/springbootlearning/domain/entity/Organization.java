package com.example.springbootlearning.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Organization extends Account {
    public Organization(String passworld, String name) {
        super(passworld, name);
    }
}
