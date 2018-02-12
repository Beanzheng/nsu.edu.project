package db.mysql;

import java.sql.*;


public class DBConnection {
	private static String userName="root";
	private static String password="123456";
	private static String driverName="com.mysql.jdbc.Driver";
	private static String url="jdbc:mysql://localhost:3306/test";
	private static ResultSet rs =null;
	private static Statement sm =null;
	
	
	 private Connection conn;

	    public DBConnection(){
	        try {
	            Class.forName(driverName);
	            this.conn = DriverManager.getConnection(url,userName,password);
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	    public Connection getConn(){
	        return this.conn;
	    }
	    public void close(){
	        if (this.conn != null){
	            try {
	                this.conn.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	    }
}
