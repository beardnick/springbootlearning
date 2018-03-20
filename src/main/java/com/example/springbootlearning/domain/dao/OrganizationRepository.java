package com.example.springbootlearning.domain.dao;

import com.example.springbootlearning.domain.entity.Organization;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizationRepository extends JpaRepository<Organization , Long>{
    public Organization findByNameAndPassword(String name , String password);

}
