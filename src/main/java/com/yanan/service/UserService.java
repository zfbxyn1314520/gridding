package com.yanan.service;

import java.util.Date;
import java.util.List;

import com.yanan.po.Role_per;
import com.yanan.po.User;

public interface UserService {

	public User validateUser(User u);
	
	public void updateUserLoginInfo(String user_login_ip,Date user_last_login,Integer userId);

	List<Role_per> getUserPerMenu(User user,Integer menuId);
	
}
