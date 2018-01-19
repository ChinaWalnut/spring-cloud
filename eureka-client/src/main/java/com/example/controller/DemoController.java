package com.example.controller;

import com.example.service.StudentClient;
import com.example.servicedto.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 测试Controller
 *
 * @author HT
 * @date 2017 -12-22 14:21:16
 */
@RestController
public class DemoController extends BaseController {

    /**
     * Discovery client.
     */
    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private StudentClient studentClient;

    /**
     * Service instances by application name list.
     *
     * @param applicationName the application name
     * @return the list
     * @author hetao
     * @date 2017 -12-22 14:20:56
     */
    @RequestMapping("/service-instances/{applicationName}")
    public List<ServiceInstance> serviceInstancesByApplicationName(
            @PathVariable String applicationName) {
        return this.discoveryClient.getInstances(applicationName);
    }

    /**
     * Index string.
     *
     * @return the string
     * @author hetao
     * @date 2017 -12-22 14:20:56
     */
    @RequestMapping(value = "/hello")
    @ResponseBody
    public String index(Student student) {
        String student1 = studentClient.getInfo(1L);
        System.out.println(student);
        return "hello world!";
    }

}
