package org.spring.boot.service;

import org.spring.boot.common.PagehelperUtils;

public interface IUserInfoService {
	/**
	 * @Title: listUser
	 * @Description: 查询用户列表
	 * @return List<UserInfo>
	 */
	@SuppressWarnings("rawtypes")
	public PagehelperUtils listUser();

	public void insert() throws Exception;
}
