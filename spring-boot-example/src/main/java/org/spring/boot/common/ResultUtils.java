package org.spring.boot.common;

import org.spring.boot.enums.ResultEnum;

public class ResultUtils {
	
	
	@SuppressWarnings("rawtypes")
	public static Result success(){
		Result result = new Result();
		result.setRetCode(ResultEnum.SCUESS.getCode());
		result.setRetMsg(ResultEnum.SCUESS.getMsg());
		return result;
	}

	public static <T> Result<T> success(T obj) {
		Result<T> result = new Result<T>();
		result.setRetCode(ResultEnum.SCUESS.getCode());
		result.setRetMsg(ResultEnum.SCUESS.getMsg());
		result.setResult(obj);
		return result;
	}
	
	@SuppressWarnings("rawtypes")
	public static Result error(String code, String msg) {
		Result result = new Result();
		result.setRetCode(code);
		result.setRetMsg(msg);
		return result;
	}
	@SuppressWarnings("rawtypes")
	public static Result error(ResultEnum resultEnum) {
		Result result = new Result();
		result.setRetCode(resultEnum.getCode());
		result.setRetMsg(resultEnum.getMsg());
		return result;
	}
	
}
