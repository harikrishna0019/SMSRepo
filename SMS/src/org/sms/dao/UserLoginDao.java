package org.sms.dao;

import org.sms.models.User;
import org.springframework.stereotype.Repository;

public interface UserLoginDao
{
  public Boolean userLoginDaoVerification(User user,String s);
}
