package com.qingzaoreading.pojo.po;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import java.util.Set;

public class User  {
    private Long user_id;

    private Long user_student_id;

    private String user_name;

    private Date user_birthday;

    private String user_sex;

    private String user_password;
    
    private String user_phone;

    private String user_is_it_vip;
    
    private String  user_grade;

    private Date user_vip_expiration_time;

    private Long user_invited_user_id;

    private Long user_integral;

    private BigDecimal user_money;

    private String user_wechat_number;

    private String user_type;

    private String user_head_portrait_url;

    

	public String getUser_grade() {
		return user_grade;
	}

	public void setUser_grade(String user_grade) {
		this.user_grade = user_grade;
	}

	public Long getUser_id() {
		return user_id;
	}

	public void setUser_d(Long user_id) {
		this.user_id = user_id;
	}

	public Long getUser_student_id() {
		return user_student_id;
	}

	public void setUser_student_id(Long user_student_id) {
		this.user_student_id = user_student_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public Date getUser_birthday() {
		return user_birthday;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public void setUser_birthday(Date user_birthday) {
		this.user_birthday = user_birthday;
	}

	public String getUser_sex() {
		return user_sex;
	}

	public void setUser_sex(String user_sex) {
		this.user_sex = user_sex;
	}

	public String getUser_phone() {
		return user_phone;
	}

	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}

	public String getUser_is_it_vip() {
		return user_is_it_vip;
	}

	public void setUser_is_it_vip(String user_is_it_vip) {
		this.user_is_it_vip = user_is_it_vip;
	}

	public Date getUser_vip_expiration_time() {
		return user_vip_expiration_time;
	}

	public void setUser_vip_expiration_time(Date user_vip_expiration_time) {
		this.user_vip_expiration_time = user_vip_expiration_time;
	}

	public Long getUser_invited_user_id() {
		return user_invited_user_id;
	}

	public void setUser_invited_user_id(Long user_invited_user_id) {
		this.user_invited_user_id = user_invited_user_id;
	}

	public Long getUser_integral() {
		return user_integral;
	}

	public void setUser_integral(Long user_integral) {
		this.user_integral = user_integral;
	}

	public BigDecimal getUser_money() {
		return user_money;
	}

	public void setUser_money(BigDecimal user_money) {
		this.user_money = user_money;
	}

	public String getUser_wechat_number() {
		return user_wechat_number;
	}

	public void setUser_wechat_number(String user_wechat_number) {
		this.user_wechat_number = user_wechat_number;
	}

	public String getUser_type() {
		return user_type;
	}

	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}

	public String getUser_head_portrait_url() {
		return user_head_portrait_url;
	}

	public void setUser_head_portrait_url(String user_head_portrait_url) {
		this.user_head_portrait_url = user_head_portrait_url;
	}

	

	
}