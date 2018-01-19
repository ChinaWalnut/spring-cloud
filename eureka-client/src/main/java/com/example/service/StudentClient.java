package com.example.service;


import com.example.servicedto.Student;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient("student-service")
public interface StudentClient {

    @RequestMapping("/students")
    List<Student> getList();

    @RequestMapping(value = "/students/{studentId}")
    String getInfo(@PathVariable("studentId") Long studentId);

}
