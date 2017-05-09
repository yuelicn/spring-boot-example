package org.spring.boot.handle;

import org.spring.boot.common.Result;
import org.spring.boot.common.ResultUtils;
import org.spring.boot.enums.ResultEnum;
import org.spring.boot.exception.ItemException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * 处理controller 抛出的异常
 * @author yue.li3
 */
@ControllerAdvice
public class ExceptionHandle {

	@SuppressWarnings({ "rawtypes", "static-access" })
	@ExceptionHandler(value = Exception.class)
	@ResponseBody
	public Result handle(Exception e) {
		
		if (e instanceof ItemException) {
			ItemException exception = (ItemException) e;
			return new ResultUtils().error(exception.getErrorCodeStr(), exception.getMessage());
		}
		return new ResultUtils().error(ResultEnum.UNKNOWN_ERROR);
	}

}
