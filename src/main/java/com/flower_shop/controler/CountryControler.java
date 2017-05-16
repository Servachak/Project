package com.flower_shop.controler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.flower_shop.entity.Country;
import com.flower_shop.service.CountryService;

public class CountryControler extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("country.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Country country = new Country();
		
		country.setName(req.getParameter("countryName"));
		
		CountryService countryService = (CountryService) WelcomeControler.context.getBean("countryServiceImpl");
		
		countryService.save(country);
		
		req.getRequestDispatcher("welcome.jsp").forward(req, resp);
	}

	
}
