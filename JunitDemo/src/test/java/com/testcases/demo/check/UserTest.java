package com.testcases.demo.check;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.vfislk.training.User;

class UserTest {
User user;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		user=new User();
	}

	@AfterEach
	void tearDown() throws Exception {
		
		user=null;
	}

	@Test
	void testGreet() {
		String username="raj";
		assertEquals("Great Day"+username, user.greet(username));
		
	}
	@Test@DisplayName("Show Fruits")
	void testshowFruits() {
		List<String> fruits =Arrays.asList("apple","Mango","Grapes","PineApple");
		assertEquals(fruits, user.showFruits());
	}
	
}
