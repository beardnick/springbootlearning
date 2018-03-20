package com.example.springbootlearning.domain.dao;

import com.example.springbootlearning.domain.entity.Student;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
    public Student finByNameAndPassword(String name , String password);
}
