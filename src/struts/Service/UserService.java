package struts.Service;
/**
 * ҵ���߼��ӿڹ���
 * @author admisnwl
 *
 */
public interface UserService {
	/**
	 * ��½ҵ��
	 * @param loginName
	 * @param loginPwd
	 * @return
	 * @throws Exception
	 */
	public Boolean login(String loginName,String loginPwd) throws Exception;
}
