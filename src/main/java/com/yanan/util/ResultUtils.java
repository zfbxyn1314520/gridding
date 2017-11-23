package com.yanan.util;

public class ResultUtils {

	private static final String SUCCESS_MSG="成功";
	
	/**
	 * http回调成功
	 * @param object
	 * @return
	 */
	public static Result success(Object object) {
		Result result = new Result();
		result.setCode(1);
		result.setMsg(SUCCESS_MSG);
		result.setData(object);
		return result;
	}
	
	/**
	 * 没有object
	 * @return
	 */
	public static Result success() {
		return success(null);
	}
	
	/**
	 * http回调失败，手动填写状态码和返回信息
	 * @param code
	 * @param msg
	 * @return
	 */
	public static Result error(Integer code,String msg) {
		Result result = new Result();
		result.setCode(code);
		result.setMsg(msg);
		return result;
	}
	
}
