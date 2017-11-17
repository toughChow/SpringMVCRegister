package com.qingshixun.project.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class SimpleUser {

	@NotBlank(message="用户名不能为空")
	@Size(min=2,max=8,message="用户名必须为2-8位")
	private String name; // @NotBlank 不为空 @Size 长度为2-8
	
	@NotBlank(message="密码不能为空")
	private String password; // @NotBlank 不为空

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "SimpleUser [name=" + name + ", password=" + password + "]";
	}
	
}
