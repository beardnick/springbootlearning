package com.example.springbootlearning.controller;

import com.example.springbootlearning.domain.entity.Organization;
import com.example.springbootlearning.service.OrganizationService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/organization")
public class OrganizationController {

    @Resource
    OrganizationService organizationService;

    @RequestMapping("/login")
    public Organization getOrganization(String name, String password) {
        return organizationService.getOrganization(name , password);
    }
}
