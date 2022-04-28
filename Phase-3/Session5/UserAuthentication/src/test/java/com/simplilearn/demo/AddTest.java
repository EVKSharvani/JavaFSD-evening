package com.simplilearn.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
class AddTest {
	
	@Autowired
	UserDAO uDAO;
	

	@Test
	void test() {
		User u =new User();
		u.setID(2);
		u.setName("Varun");
		u.setUname("varun@gmail.com");
		u.setPwd("var24");
		int x=uDAO.add(u);
		assertEquals(1,x);
	}

	@Test
	void findTest() {
		User u =uDAO.getByName("sharvani");
		System.out.println(u);
		assertNotNull(u);
	}
}
