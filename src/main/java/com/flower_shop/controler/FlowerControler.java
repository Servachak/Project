package com.flower_shop.controler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.flower_shop.entity.Flower;
import com.flower_shop.service.FlowerService;

public class FlowerControler extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("flower.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Flower flower = new Flower();
		flower.setName(req.getParameter("flowerName"));
		flower.setColor(req.getParameter("flowerColor"));
//		flower.setPrice("price");
		
		FlowerService flowerService = (FlowerService) WelcomeControler.context.getBean("flowerServiceImpl");
		
		flowerService.save(flower);
		
		req.getRequestDispatcher("welcome.jsp").forward(req, resp);
	}

	
}
