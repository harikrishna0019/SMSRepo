package org.sms.models;

import javax.validation.Valid;
import javax.validation.constraints.Size;

public class User {
	@Size(min=1,max=20)
	private String loginUserName;
	@Size(min=5,max=20)
	private String loginUserPassword;
	public String getLoginUserName() {
		return loginUserName;
	}
	public void setLoginUserName(String loginUserName) {
		this.loginUserName = loginUserName;
	}
	public String getLoginUserPassword() {
		return loginUserPassword;
	}
	public void setLoginUserPassword(String loginUserPassword) {
		this.loginUserPassword = loginUserPassword;
	}
	

}
