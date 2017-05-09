package org.spring.boot.enums;

public enum ResultEnum {
	UNKNOWN_ERROR("-1", "未知错误"),
	SCUESS("0000000", "成功"),
	PRIMARY_SCHOO("1001001","你还在上小学吧"),
	JUNIOR_SCHOO("1001001","你还在上小学吧");
	
	private String code;
	
	private String msg;

	private ResultEnum(String code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public String getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}
	
	

}
