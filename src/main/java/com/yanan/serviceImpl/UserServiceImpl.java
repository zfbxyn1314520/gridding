package com.yanan.serviceImpl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yanan.dao.UserDao;
import com.yanan.po.User;
import com.yanan.service.UserService;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	public User validateUser(User u) {
		// TODO Auto-generated method stub
		return this.userDao.validateUser(u);
	}

	public void updateUserLoginInfo(String user_login_ip, Date user_last_login, Integer userId) {
		// TODO Auto-generated method stub
		this.userDao.updateUserLoginInfo(user_login_ip, user_last_login, userId);
	}

}
