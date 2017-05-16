package com.flower_shop.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flower_shop.dao.FlowerDao;
import com.flower_shop.entity.Flower;
import com.flower_shop.service.FlowerService;

@Service
public class FlowerServiceImpl implements FlowerService{

	@Autowired
	private FlowerDao flowerDao;
	@Override
	public void save(Flower flower) {
		flowerDao.save(flower);
		
	}

	@Override
	public List<Flower> findAll() {
		return flowerDao.findAll();
	}

	@Override
	public Flower findOne(int id) {
		return flowerDao.findOne(id);
	}

	@Override
	public void delete(int id) {
		flowerDao.delete(id);
		
	}

	@Override
	public void update(Flower flower) {
		flowerDao.save(flower);
		
	}

}
