package com.qkqknao.dao;

import com.qkqknao.model.UserInfo;

public interface UserInfoMapper {
	
	/**
	 * @author wmt
	 * @describe 登陆Dao
	 * @param username 用户名
	 * @param password 密码
	 * @return
	 */
	UserInfo login(String username, String password);

}
