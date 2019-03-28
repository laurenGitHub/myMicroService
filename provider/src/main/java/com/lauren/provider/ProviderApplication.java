package com.lauren.provider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProviderApplication.class, args);
	}

	@Value("${server.port}")
	String port;

	@RequestMapping("/hi")
	public String home(@RequestParam(value = "name",defaultValue = "forezp") String name)
	{
		System.out.println("this is provider service executed !");
		return "hello "+name+", this is provider, i am from port:" + port;
	}

	@RequestMapping("/get/user")
	public String getUser(@RequestParam(value = "username") String username)
	{
		System.out.println("this is provider service executed !");
		return "hello "+username+",this is provider, i am from port:" + port;
	}

}
