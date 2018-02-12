package struts.junitTest;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;

import struts.DAO.UserDAO;
import struts.DAOImpl.UserDAOImpl;
import struts.Service.UserService;
import struts.ServiceImpl.UserServiceImpl;
import db.mysql.DBConnection;

public class Test {
	private static DBConnection db= new DBConnection();
	private static UserDAO dao= null;
	private static UserService service=null;
	private static Connection conn=null;
	Statement sm =null;
	@BeforeClass
	public static void before() throws SQLException{
		Connection conn = db.getConn();
		dao=new UserDAOImpl(conn);
		service=new UserServiceImpl();
		Statement sm = conn.createStatement();
	}
//	@org.junit.Test
//	public void  TestMysql() throws SQLException{
//
//		String sql="SELECT * FROM user";
//		ResultSet rs =db.query(sql);
//		while (rs.next()){
//			for(int i=1;i<=4;i++)
//			System.out.print(rs.getObject(i)+"\n");
//			
//		} 
//	}
	
	@org.junit.Test		//²âÊÔDAO,DAOImplµÄµ×²ãÊý¾Ý
	public void TestDAOImpl() throws Exception{
		String loginName="user";
		String loginPwd="ss";
		Assert.assertTrue(dao.login(loginName, loginPwd));
	}
	@org.junit.Test
	public void TestServiceImpl() throws Exception{
		String loginName="user";
		String loginPwd="ss";
		Assert.assertTrue(service.login(loginName, loginPwd));
	}
	@AfterClass
	public static void after(){
		
	}
}
