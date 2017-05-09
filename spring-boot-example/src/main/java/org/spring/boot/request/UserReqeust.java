package org.spring.boot.request;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;


public class UserReqeust {
	@NotEmpty(message = "用户名不能为空")
	private String name;
	@NotNull(message = "年龄不能为空")
	@Min(value = 12, message = "未成年着禁止入内")
	private Integer age;
	
	@NotEmpty(message="密码不能为空")
    @Length(min=6,message="密码长度不能小于6位")
    private String password;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserReqeust [name=" + name + ", age=" + age + ", password=" + password + "]";
	}




}
