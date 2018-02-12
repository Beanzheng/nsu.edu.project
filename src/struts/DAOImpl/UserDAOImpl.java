package struts.DAOImpl;

import java.sql.Connection;
import java.sql.ResultSet;

import javax.mail.Flags.Flag;

import struts.DAO.UserDAO;
import struts.ORM.User;

public class UserDAOImpl extends AbstractDAOImpl implements UserDAO{

	public UserDAOImpl(Connection conn) {
		super(conn);
	}
	@Override
	public boolean login(String loginName, String loginPwd) throws Exception{
		boolean flag=false;
		String sql="select * from user where userName=? and pwd=?";
		super.pstm= super.conn.prepareStatement(sql);
		super.pstm.setString(1,loginName);
		super.pstm.setString(2, loginPwd);
		ResultSet rs= super.pstm.executeQuery();
		if(rs.next()){
			flag=true;
			System.out.println("没错，你成功了");
			return flag;
		}else {
			return flag;
		}
	}

}
