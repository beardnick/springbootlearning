package com.example.springbootlearning.controller;

import com.example.springbootlearning.domain.entity.Teacher;
import com.example.springbootlearning.service.TeacherService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Resource
    TeacherService teacherService;

    @RequestMapping("/login")
    public Teacher getTeacher(HttpServletRequest request) {
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        return teacherService.getTeacher(name , password);
    }
}
