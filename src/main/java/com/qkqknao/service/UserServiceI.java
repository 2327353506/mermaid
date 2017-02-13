package com.qkqknao.service;

import com.qkqknao.model.UserInfo;

public interface UserServiceI {

	/**
	 * @author wmt
	 * @describe 登陆
	 * @param username 用户名
	 * @param password 密码
	 * @return
	 */
	UserInfo login(String username, String password);
}
