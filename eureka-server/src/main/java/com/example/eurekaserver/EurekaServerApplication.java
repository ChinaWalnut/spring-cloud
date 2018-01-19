package com.example.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * SpringBoot启动类
 * EnableEurekaServer注解，springboot会认为添加该注解的为eureka server，启动默认web容器
 * SpringBootApplication注解，启动默认配置，相当于EnableAutoConfiguration+ComponentScan
 * @author HT
 * @date 2017 -12-22 10:41:29
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {

	/**
	 * 主方法
	 *
	 * @param args the input arguments
	 * @author HT
	 * @date 2017 -12-22 10:41:29
	 */
	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
	}
}
