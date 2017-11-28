package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yanan.dao.RoleDao;
import com.yanan.dao.UserDao;
import com.yanan.po.Role;
import com.yanan.po.User;

public class RoleDaoTest {

	
	@Test
	public void testGetRoleByRoleId() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("conf/spring-mybatis.xml");
		RoleDao roleDao = ac.getBean("roleDao",RoleDao.class);
		Role role = roleDao.getRoleById(6);
		System.out.println(role);
		
	}
	
}
