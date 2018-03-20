package com.example.springbootlearning.service;

import com.example.springbootlearning.domain.entity.Student;
import com.example.springbootlearning.domain.dao.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public Student getStudent(String name , String password){
        return studentRepository.finByNameAndPassword(name , password);
    }
}
