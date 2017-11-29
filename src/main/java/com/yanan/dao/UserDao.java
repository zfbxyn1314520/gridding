package com.yanan.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yanan.po.Role_per;
import com.yanan.po.User;

public interface UserDao {
	
	public User validateUser(User u);
	
	void updateUserLoginInfo(@Param("user_login_ip") String user_login_ip,
			@Param("user_last_login") Date user_last_login,@Param("userId") Integer userId);

	List<Role_per> getUserPerMenu(@Param("user") User user,@Param("menuId") Integer menuId); 

}
