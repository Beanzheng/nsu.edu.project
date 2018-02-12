package struts.Factory;

import java.sql.Connection;

import struts.DAO.UserDAO;
import struts.DAOImpl.UserDAOImpl;

public class DAOFactory {
	public static UserDAO getUserDAoInstance(Connection conn){
		return new UserDAOImpl(conn);
	}
}
