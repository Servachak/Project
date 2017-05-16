package com.flower_shop.controler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.flower_shop.entity.User;
import com.flower_shop.service.UserService;

public class UserControler extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	req.getRequestDispatcher("user.jsp").forward(req, resp);
	
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		User user = new User();
		
		user.setName(req.getParameter("userName"));
		user.setPassword(req.getParameter("userPassword"));
		user.setEmail(req.getParameter("userEmail"));
		user.setSex(req.getParameter("userSex"));
		
		UserService userService = (UserService) WelcomeControler.context.getBean("userServiceImpl");
		
		userService.save(user);
		
		req.getRequestDispatcher("welcome.jsp").forward(req, resp);
	}

	
}
