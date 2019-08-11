package com.teqto.tqshop;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;



@SpringBootApplication
@EnableDiscoveryClient
public class TqshopApplication {

	public static void main(String[] args) {
		SpringApplication.run(TqshopApplication.class, args);
	}

	@RequestMapping(value = "/echoStudentName/{name}")
    public String echoStudentName(@PathVariable(name = "name") String name)
    {
        return "hello  <strong style=\"color: red;\">" + name + " </strong> Responsed on : " + new Date();
    }
	
	@RequestMapping(value = "/saveStudentName/{name}")
    public String saveStudentName(@PathVariable(name = "name") String name)
    {
        return "saved  <strong style=\"color: red;\">" + name + " </strong> Responsed on : " + new Date();
    }
}
