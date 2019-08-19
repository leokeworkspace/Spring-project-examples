package com.leo.SpringBoot2;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.leo.SpringBoot2.entities.UserInfo;
import com.leo.SpringBoot2.service.UserService;

@SpringBootTest
public class UserTest {
	
	@Autowired
	UserService userService;
	
	@Test
	void getUserAll() {
		System.out.println("------------------- run start ----------------------");
		List<UserInfo> uerList = userService.getAllUser();
		uerList.stream().forEach(p -> System.out.println(p.getUserName()));
		System.out.println("------------------- run end ----------------------");
	}

}
