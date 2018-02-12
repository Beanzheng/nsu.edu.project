package struts.Service;
/**
 * 业务逻辑接口管理
 * @author admisnwl
 *
 */
public interface UserService {
	/**
	 * 登陆业务
	 * @param loginName
	 * @param loginPwd
	 * @return
	 * @throws Exception
	 */
	public Boolean login(String loginName,String loginPwd) throws Exception;
}
