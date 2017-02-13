package com.qkqknao.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qkqknao.dao.UserInfoMapper;
import com.qkqknao.model.UserInfo;
import com.qkqknao.service.UserServiceI;


/**
 * 用户信息业务类
 * @author wmt
 */
@Service("userService")
public class UserServiceImpl implements UserServiceI {
	
	@Autowired
	private UserInfoMapper userDao;

	@Override
	public UserInfo login(String username, String password) {
		// TODO Auto-generated method stub
		return userDao.login(username,password);
	}



}
