package com.example.springbootlearning.domain.dao;

import com.example.springbootlearning.domain.entity.Teacher;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher , Long> {
    public Teacher findByNameAndPassword(String name , String password);
}
