package com.example.springbootlearning.service;

import com.example.springbootlearning.domain.dao.OrganizationRepository;
import com.example.springbootlearning.domain.entity.Organization;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrganizationService {

    @Autowired
    OrganizationRepository organization;

    public Organization getOrganization(String name, String password) {
        return organization.findByNameAndPassword(name , password);
    }
}
