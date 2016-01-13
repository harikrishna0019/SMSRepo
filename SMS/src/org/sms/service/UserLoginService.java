package org.sms.service;

import org.sms.models.User;

public interface UserLoginService {
	
	public Boolean userLoginVerification(User user,String s);

}
