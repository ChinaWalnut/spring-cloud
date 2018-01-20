package com.example.configuration;

import com.example.service.StudentClient;
import com.example.servicedto.Student;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


/**
 * 调用熔断默认返回处理
 *
 * @author HT
 * @date 2018 -01-16 16:42:59
 */
@Service
public class StudentClientHystrix implements StudentClient {

    @Override
    public List<Student> getList() {
        return new ArrayList<>();
    }

    @Override
    public Student getInfo(Long studentId) {
        return new Student();
    }
}