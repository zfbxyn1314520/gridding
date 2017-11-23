package com.yanan.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yanan.dao.UserDao;
import com.yanan.po.User;
import com.yanan.service.UserService;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	public User validateUser(User user) {
		// TODO Auto-generated method stub
		return this.userDao.validateUser(user);
	}

}
