package com.qkqknao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qkqknao.service.UserServiceI;
import com.qkqknao.util.ResponseMsg;
/**
 * @author wmt
 * @date 2017-02-09
 * @description 登录Controller
 */
@Controller
@RequestMapping(value="/user")
public class UserController {
	
	@Autowired
	private UserServiceI userI;

	@RequestMapping(method=RequestMethod.POST)
	@ResponseBody
	public ResponseMsg login(String username,String password){
		
		return new ResponseMsg().setData(userI.login(username,password));
	}

	
	
}
