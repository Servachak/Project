package com.flower_shop.controler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.flower_shop.service.CountryService;
import com.flower_shop.service.FlowerService;
import com.flower_shop.service.UserService;

public class WelcomeControler extends HttpServlet{

static ConfigurableApplicationContext context = null;
	
	static{
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		UserService userService = (UserService) context.getBean("userServiceImpl");
		
		FlowerService flowerService = (FlowerService) context.getBean("flowerServiceImpl");
		
		CountryService countryService = (CountryService) context.getBean("countryServiceImpl");
		
		req.getRequestDispatcher("welcome.jsp").forward(req, resp);
	}
}
