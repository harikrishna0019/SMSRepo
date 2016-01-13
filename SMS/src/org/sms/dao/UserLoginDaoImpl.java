package org.sms.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.sms.models.User;
import org.sms.service.UserLoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;
@Repository("userLoginDao")
public class UserLoginDaoImpl implements UserLoginDao
{
	
	@Autowired
	@Qualifier("template")
	JdbcTemplate template;

	
	static Logger log = Logger.getLogger(UserLoginServiceImpl.class.getName());
	
	public List<User> getUserList()
	{
		return template.query("select * from userlogin",new ResultSetExtractor<List<User>>()
				{  
		    @Override  
		    public List<User> extractData(java.sql.ResultSet rs)throws SQLException, DataAccessException
					{  
		      
					        List<User> list=new ArrayList<User>();  
					        while(rs.next())
					        {  
						        User e=new User();  
						        e.setLoginUserName(rs.getString(2));
						        e.setLoginUserPassword(rs.getString(3));
						        list.add(e);  
						        
					        }  
					        
					        return list;  
					        }
				});
	}

	@Override
	public Boolean userLoginDaoVerification(User user,String s) {
		// TODO Auto-generated method stub
		System.out.println("64474646464664646464646464646464644644");
		System.out.println(s);
		String s1=user.getLoginUserName();
		String s2=user.getLoginUserPassword();
		System.out.println(s1);
		System.out.println(s2);
		if(s.equals("admin"))
		{
			int i=template.queryForInt("select count(*) from Adminlogin where username=? and password=?",new Object[]{s1,s2});
			System.out.println("==========================");
			System.out.println("admin login access");
			System.out.println(i);
			if(i==1)
			{
				
				return true;
			}else{
				return false;
			}
		}else
		{
			System.out.println("user login access");
			int i=template.queryForInt("select count(*) from userlogin where username=? and password=?",new Object[]{s1,s2});
			System.out.println("==========================");
			System.out.println(i);
			if(i==1)
			{
				
				return true;
			}else{
				return false;
			}
			
		}
	}
	

	
	/*public Boolean userLoginDaoVerification(User user) 
	{
		// TODO Auto-generated method stud
		System.out.println("============================================================");
		System.out.println("============================================================");
		for(int i=0;i<getUserList().size();i++){
		System.out.println(getUserList().get(i).getLoginUserName());
		System.out.println(getUserList().get(i).getLoginUserPassword());
		}
		boolean flag=true;
		
		System.out.print("hai this is dao implementation"+user.getLoginUserName());
		
		for(int i=0;i<getUserList().size();i++)
		{
				String u=getUserList().get(i).getLoginUserName();
				String p=getUserList().get(i).getLoginUserPassword();
				if(flag)
				{
				  if((user.getLoginUserName()).equals(u)&&(user.getLoginUserPassword()).equals(p))
			     	{
				     	log.info("in user Login dao verification of ");		
			         }
				      else
			          {
			         	flag=false;
			           }
				     }
			}
		return flag;
		
	}
*/	
}