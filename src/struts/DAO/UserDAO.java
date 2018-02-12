package struts.DAO;
/**
 * 底层数据接口管理
 */
public interface UserDAO {
	/**
	 * 
	 * @param loginName
	 * @param loginPwd
	 * @throws Exception 
	 */
	public boolean login(String loginName,String loginPwd) throws Exception;
}
