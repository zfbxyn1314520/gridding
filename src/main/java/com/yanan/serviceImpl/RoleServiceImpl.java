package com.yanan.serviceImpl;


import com.yanan.dao.RoleDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yanan.po.Role;
import com.yanan.service.RoleService;
@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleDao roleDao;
	
	public Role getRoleById(Integer roleId) {
		// TODO Auto-generated method stub
		return this.roleDao.getRoleById(roleId);
	}

}
