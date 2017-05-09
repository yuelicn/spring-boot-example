package org.spring.boot.service;

import org.spring.boot.common.Result;
import org.spring.boot.common.ResultUtils;
import org.spring.boot.enums.ResultEnum;
import org.spring.boot.exception.ItemException;
import org.springframework.stereotype.Service;

@Service
public class ExampleService {
	
	@SuppressWarnings("unchecked")
	public Result<Object> sayExceptionPost(int age) {
		
		if (age < 10) {
			throw new ItemException(ResultEnum.PRIMARY_SCHOO);
		}
		if (age > 10 && age < 15) {
			throw new ItemException(ResultEnum.JUNIOR_SCHOO);
		}
		return ResultUtils.success();
	}

}
