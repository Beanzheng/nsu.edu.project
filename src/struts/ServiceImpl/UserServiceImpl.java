package struts.ServiceImpl;

import java.sql.Connection;

import db.mysql.DBConnection;
import struts.Factory.DAOFactory;
import struts.Service.UserService;

public class UserServiceImpl implements UserService{
	private DBConnection dbc= new DBConnection();
	@Override
	public Boolean login(String loginName, String loginPwd) throws Exception {
		
		return DAOFactory.getUserDAoInstance( 
				(Connection)this.dbc.getConn()).login(loginName, loginPwd);
	}

}
