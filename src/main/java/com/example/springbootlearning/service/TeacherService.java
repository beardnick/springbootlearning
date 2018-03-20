package com.example.springbootlearning.service;

import com.example.springbootlearning.domain.dao.TeacherRepository;
import com.example.springbootlearning.domain.entity.Teacher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {

    @Autowired
    TeacherRepository teacher;

    public Teacher getTeacher(String name, String password) {
        return teacher.findByNameAndPassword(name , password);
    }


}
