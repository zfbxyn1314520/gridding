package com.yanan.service;

import java.util.Date;

import com.yanan.po.User;

public interface UserService {

	public User validateUser(User u);
	
	public void updateUserLoginInfo(String user_login_ip,Date user_last_login,Integer userId);
	
}
