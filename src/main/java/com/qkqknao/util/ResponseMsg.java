package com.qkqknao.util;

/**
 * @author wmt
 * @date 2017-02-09
 * @description Controller数据返回类
 */
public class ResponseMsg {
	
	private int code;
	private String msg;
	private Object data;
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getData() {
		return data;
	}
	public ResponseMsg setData(Object data) {
		this.data = data;
		return this;
	}
	
	
	

}
