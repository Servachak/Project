package com.flower_shop.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flower_shop.dao.FlowerDao;
import com.flower_shop.dao.UserDao;
import com.flower_shop.entity.User;
import com.flower_shop.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	
	public void save(User user) {
		userDao.save(user);
	}

	@Override
	public List<User> findAll() {
		
		return userDao.findAll();
	}

	@Override
	public User findOne(int id) {
		
		return userDao.findOne(id);
	}

	@Override
	public void delete(int id) {
		userDao.delete(id);
	}

		
	@Override
	public void update(User user) {
		userDao.save(user);
		
	}

}
