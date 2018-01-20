package com.example.controller;

import com.example.servicedto.Student;
import com.google.gson.Gson;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/students")
public class StudentController {

    @GetMapping
    public String getList(){
        Gson gson = new Gson();
        List<Student> list = new ArrayList<>();
        Student student1 = new Student();
        student1.setName("张三");
        student1.setNumber("z12138");
        Student student2 = new Student();
        student2.setName("李四");
        student2.setNumber("s12138");
        list.add(student1);
        list.add(student2);
        return gson.toJson(list);
    }

    @GetMapping(value = "/{studentId}")
    public Student getInfo(@PathVariable("studentId") Long studentId ){
        Gson gson = new Gson();
        Student student = new Student();
        student.setName("李四");
        student.setNumber("s12138");
        return student;
    }

}
