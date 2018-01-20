package com.example.service;


import com.example.configuration.StudentClientHystrix;
import com.example.servicedto.Student;
import org.springframework.cloud.netflix.feign.FeignAutoConfiguration;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(value = "student-service",configuration = FeignAutoConfiguration.class, fallback = StudentClientHystrix.class)
public interface StudentClient {

    @RequestMapping("/students")
    List<Student> getList();

    @RequestMapping(value = "/students/{studentId}")
    Student getInfo(@PathVariable("studentId") Long studentId);

}
