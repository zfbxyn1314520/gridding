package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yanan.po.Role;
import com.yanan.service.RoleService;
import com.yanan.serviceImpl.RoleServiceImpl;

public class RoleServiceTest {
	
	
	@Test
	public void testGetRoleById() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("conf/spring-mybatis.xml");
		RoleServiceImpl roleService = ac.getBean("roleServiceImpl",RoleServiceImpl.class);
		Role role = roleService.getRoleById(6);
		System.out.println(role);
	}
}
