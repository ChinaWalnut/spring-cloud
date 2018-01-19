package com.example.eurekaclient;

import com.example.service.StudentClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * SpringBoot启动类
 * EnableDiscoverClient注解，SpringBoot会认为有该注解的应用为eureka client
 * @author HT
 * @date 2017 -12-22 10:47:54
 */
@SpringBootApplication(scanBasePackages = {"com.example"})
@EnableEurekaClient
@EnableFeignClients(basePackageClasses = {StudentClient.class})
public class EurekaClientApplication {

	/**
	 * 主方法
	 *
	 * @param args the input arguments
	 * @author HT
	 * @date 2017 -12-22 10:47:54
	 */
	public static void main(String[] args) {
		SpringApplication.run(EurekaClientApplication.class, args);
	}
}
