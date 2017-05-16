package com.flower_shop.controler;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.flower_shop.entity.User;
import com.flower_shop.service.UserService;

public class Main {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		UserService userServise = (UserService) context.getBean("userServiceImpl");
		
		userServise.save(new User("Tars", "sertw", "man", "taras@ukr.net"));
		context.close();

	}

}
