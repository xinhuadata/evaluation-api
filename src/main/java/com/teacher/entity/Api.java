package com.teacher.entity;

import java.util.Date;


/**
 * 功能描述: 考勤的实体类
 *
 * @auther: njw
 * @date: 2018/7/30
 */

public class Api {

	private Integer id;
	private Object Name;
	private Object EnrollNumber;
	private Object Time;
	private Object VerifyMode;
	private Object InOutMode;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Object getName() {
		return Name;
	}
	public void setName(Object name) {
		Name = name;
	}
	public Object getEnrollNumber() {
		return EnrollNumber;
	}
	public void setEnrollNumber(Object enrollNumber) {
		EnrollNumber = enrollNumber;
	}
	public Object getTime() {
		return Time;
	}
	public void setTime(Object time) {
		Time = time;
	}
	public Object getVerifyMode() {
		return VerifyMode;
	}
	public void setVerifyMode(Object verifyMode) {
		VerifyMode = verifyMode;
	}
	public Object getInOutMode() {
		return InOutMode;
	}
	public void setInOutMode(Object inOutMode) {
		InOutMode = inOutMode;
	}
	
	
	
}
