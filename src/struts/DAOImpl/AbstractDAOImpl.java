package struts.DAOImpl;
import java.sql.*;
public abstract class AbstractDAOImpl {
	protected Connection conn;
	protected PreparedStatement psta;
	public PreparedStatement pstm;
	public AbstractDAOImpl(Connection conn){
		this.conn=conn;
	}
}
