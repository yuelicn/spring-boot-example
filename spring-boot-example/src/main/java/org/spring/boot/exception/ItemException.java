package org.spring.boot.exception;

import org.spring.boot.enums.ResultEnum;

/**
 * 自定义异常类：
 * 注意: 这里 extends RuntimeException 因为 spring 在事务回滚时默认时遇到Runtionexception
 * 
 * @author yue.li3
 *
 */
public class ItemException extends RuntimeException {

	/**
	 * @Fields serialVersionUID : TODO
	 */
	private static final long serialVersionUID = 1L;
	private String errorCode;

	public ItemException() {
	}

	public ItemException(Throwable ex) {
		super(ex);
	}

	public ItemException(int errorCode) {
		this.errorCode = String.valueOf(errorCode);
	}

	public ItemException(String errorCode) {
		this.errorCode = errorCode;
	}

	public ItemException(int errorCode, String msg) {
		super(msg);
		this.errorCode = String.valueOf(errorCode);
	}

	public ItemException(ResultEnum result) {
		super(result.getMsg());
		this.errorCode = result.getCode();
	}

	public ItemException(String errorCode, String msg) {
		super(msg);
		this.errorCode = errorCode;
	}

	public ItemException(int errorCode, Throwable ex) {
		super(ex);
		this.errorCode = String.valueOf(errorCode);
	}

	public ItemException(String errorCode, Throwable ex) {
		super(ex);
		this.errorCode = errorCode;
	}

	public ItemException(int errorCode, String msg, Throwable ex) {
		super(msg, ex);
		this.errorCode = String.valueOf(errorCode);
	}

	public int getErrorCode() {
		return Integer.parseInt(this.errorCode);
	}

	public String getErrorCodeStr() {
		return this.errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = String.valueOf(errorCode);
	}
}
