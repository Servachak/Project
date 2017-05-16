package com.flower_shop.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flower_shop.dao.CountryDao;
import com.flower_shop.entity.Country;
import com.flower_shop.service.CountryService;

@Service
public class CountryServiceImpl implements CountryService{

	@Autowired
	private CountryDao countryDao;


	public void save(Country country) {
		countryDao.save(country);
		
	}

	@Override
	public List<Country> findAll() {
		return countryDao.findAll();
	}

	@Override
	public Country findOne(int id) {
		return countryDao.findOne(id);
	}

	@Override
	public void delete(int id) {
	countryDao.delete(id);
		
	}

	@Override
	public void update(Country country) {
		countryDao.save(country);
		
	}

}
