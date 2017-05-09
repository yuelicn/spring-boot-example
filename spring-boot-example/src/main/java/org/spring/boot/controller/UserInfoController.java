package org.spring.boot.controller;

import org.spring.boot.common.PagehelperUtils;
import org.spring.boot.common.Result;
import org.spring.boot.common.ResultUtils;
import org.spring.boot.service.IUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserInfoController {
	@Autowired
	private IUserInfoService userInfoService;
	@PostMapping(value = "/userlist}")
	public Result<Object> sayExceptionPost() {
		@SuppressWarnings("rawtypes")
		PagehelperUtils listUser = userInfoService.listUser();
		return ResultUtils.success(listUser);
	}
	
	@SuppressWarnings("unchecked")
	@GetMapping(value = "/insert")
	public Result<Object> insertExceptionPost() throws Exception {
		userInfoService.insert();
		return ResultUtils.success();
		
	}
	
}
