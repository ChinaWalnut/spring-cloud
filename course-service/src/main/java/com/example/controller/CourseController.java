package com.example.controller;

import com.example.servicedto.Course;
import com.google.gson.Gson;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/course")
public class CourseController {

    @GetMapping(value = "/{courseId}")
    public String getInfo(@PathVariable("courseId") Long courseId) {
        Gson gson = new Gson();
        return gson.toJson(new Course());
    }

}
