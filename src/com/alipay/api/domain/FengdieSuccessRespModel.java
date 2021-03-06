package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 判断云凤蝶请求的接口成功与否
 *
 * @author auto create
 * @since 1.0, 2017-10-13 16:57:15
 */
public class FengdieSuccessRespModel extends AlipayObject {

	private static final long serialVersionUID = 5382761647745625317L;

	/**
	 * 判断请求操作是否成功，值为 true 或者 false
	 */
	@ApiField("success")
	private Boolean success;

	public Boolean getSuccess() {
		return this.success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}

}
