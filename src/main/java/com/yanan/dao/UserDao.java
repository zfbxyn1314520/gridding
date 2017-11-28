package com.yanan.dao;

import java.util.Date;

import org.apache.ibatis.annotations.Param;

import com.yanan.po.User;

public interface UserDao {
	
	public User validateUser(User u);
	
	void updateUserLoginInfo(@Param("user_login_ip") String user_login_ip,
			@Param("user_last_login") Date user_last_login,@Param("userId") Integer userId);
}
