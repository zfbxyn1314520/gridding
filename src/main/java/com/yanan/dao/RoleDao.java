package com.yanan.dao;

import org.apache.ibatis.annotations.Param;

import com.yanan.po.Role;

public interface RoleDao {

	public Role getRoleById(@Param("roleId") Integer roleId);
	
}
