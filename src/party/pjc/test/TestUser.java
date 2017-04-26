package party.pjc.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import party.pjc.entity.User;
import party.pjc.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestUser {

	@Autowired
	private UserService userService;
	@Test
	public void demo1(){
		User user =new User();
		user.setUsername("ilvc");
		user.setPassword("123456");
		userService.saveUser(user);
		System.out.println(userService.findAllList());
		
		
	}
}
