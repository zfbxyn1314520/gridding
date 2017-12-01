package com.yanan.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.yanan.dao.MenuDao;
import org.springframework.stereotype.Service;

import com.yanan.po.Menu;
import com.yanan.service.MenuService;
@Service
public class MenuServiceImpl implements MenuService {

	@Autowired
	private MenuDao menuDao;
	
	
	public List<Menu> getAllMenu() {
		// TODO Auto-generated method stub
		return this.menuDao.getAllMenu();
	}

}
