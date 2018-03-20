package com.example.springbootlearning.controller;

import com.example.springbootlearning.domain.entity.Student;
import com.example.springbootlearning.service.StudentService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Resource
    StudentService service;

    @RequestMapping("/login")
    public Student getStudent(HttpServletRequest request) {
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        return service.getStudent(name , password);
    }



//    @RequestMapping("/home")
}
