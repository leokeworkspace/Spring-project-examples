package com.leo.SpringBoot2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leo.SpringBoot2.entities.UserInfo;
import com.leo.SpringBoot2.repository.UserInfoRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserInfoRepository userInfoRepository;
	
	public List<UserInfo> getAllUser() {
		return userInfoRepository.findAll();
	}

}
