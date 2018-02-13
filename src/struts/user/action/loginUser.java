package struts.user.action;

import struts.Factory.ServiceFactory;
import struts.ORM.User;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class loginUser extends ActionSupport implements ModelDriven<User>{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3976216323852801832L;
	private User model= new User();
	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return model;
	}
	public String execute(String loginName,String loginPwd) throws Exception{
		loginName=model.getLoginName();
		loginPwd=model.getLoginPwd();
		System.out.println("�û���:"+loginName);
		System.out.println("����"+loginPwd);
		if (ServiceFactory.getUserServiceInstance().login(loginName, loginPwd)) {
			System.out.println("success");
			return INPUT;
		}else {
			System.out.println("faild");
			return ERROR;
		}
	}
	public void vaildate(){
		if(model.getLoginName() == null){
			addFieldError("loginName", "�û�������Ϊ��");
		}else if (model.getLoginPwd() == null) {
			addFieldError("loginPwd", "���벻��Ϊ��");
		}
	}
	  public void addActionError(String anErrorMessage){
		   String s=anErrorMessage;
		   System.out.println(s);
		  }
		  public void addActionMessage(String aMessage){
		   String s=aMessage;
		   System.out.println(s);
		  
		  }
		  public void addFieldError(String fieldName, String errorMessage){
		   String s=errorMessage;
		   String f=fieldName;
		   System.out.println(s);
		   System.out.println(f);
		  
		  }
}
