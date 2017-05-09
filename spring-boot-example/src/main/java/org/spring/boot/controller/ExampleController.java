package org.spring.boot.controller;

import javax.validation.Valid;

import org.spring.boot.common.Result;
import org.spring.boot.common.ResultUtils;
import org.spring.boot.properties.Userproperties;
import org.spring.boot.request.UserReqeust;
import org.spring.boot.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {
	
	@Autowired
	private Userproperties userProperties;
	@Autowired
	private ExampleService exampleService;
	
	@GetMapping(value = "/properties")
	public Result<Userproperties> properties() {
		return ResultUtils.success(userProperties);
	}
	
	@SuppressWarnings("unchecked")
	@PostMapping(value = "/valid")
	public Result<UserReqeust> sayHelloPost(@Valid UserReqeust user, BindingResult bindingResult) {
		Result<UserReqeust> result = null;
		if (bindingResult.hasErrors()) {
			System.out.println(bindingResult.getFieldError().getDefaultMessage());
			result = ResultUtils.error("0000001", bindingResult.getFieldError().getDefaultMessage());
			return result;
		}
		result = ResultUtils.success(user);
		System.out.println(user.toString());
		return result;
	}
	@PostMapping(value = "/exception/{age}")
	public Result<Object> sayExceptionPost(@PathVariable("age") int age) {
		return exampleService.sayExceptionPost(age);
	}
}
