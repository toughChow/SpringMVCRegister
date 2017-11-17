package com.qingshixun.project.model;

import javax.validation.constraints.NotBlank;

public class DefaultUser extends SimpleUser {
	
	@NotBlank(message="邮箱不能为空")
	private String email;
	
	@NotBlank(message="职业不能为空")
	private String profession; // 职业 不为空

	public DefaultUser() {
		super();
	}

	public DefaultUser(String email, String profession) {
		super();
		this.email = email;
		this.profession = profession;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	@Override
	public String toString() {
		return "DefaultUser [email=" + email + ", profession=" + profession + "]";
	}

}
