package struts.DAO;
/**
 * �ײ����ݽӿڹ���
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
