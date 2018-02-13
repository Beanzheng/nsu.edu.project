package struts.Factory;

import struts.Service.UserService;
import struts.ServiceImpl.UserServiceImpl;

public class ServiceFactory {
	public static UserService getUserServiceInstance(){
		return new UserServiceImpl();
		
	} 
}
