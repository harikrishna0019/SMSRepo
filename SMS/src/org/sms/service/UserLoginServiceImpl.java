package org.sms.service;

import java.util.logging.Logger;

import org.sms.dao.UserLoginDao;
import org.sms.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service("userLoginService")
public class UserLoginServiceImpl implements UserLoginService 
{
	@Autowired
	UserLoginDao userLoginDao;
	
	static Logger log = Logger.getLogger(UserLoginServiceImpl.class.getName());

	@Override
	public Boolean userLoginVerification(User user1,String s) {
		// TODO Auto-generated method stub
		
		Boolean b=userLoginDao.userLoginDaoVerification(user1,s);
		
		log.info("this is userloginservice return from dao");
		return b;
	}

}