package online.shixun.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import online.shixun.model.Admin;
import online.shixun.service.Impl.AdminServiceImpl;

@Component
public class AjaxAdminAction extends ActionSupport implements SessionAware {

	private static final long serialVersionUID = 1L;
	private Map<String, Object> session;

	private String username;
	private String password;
	private String validateNum;

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getValidateNum() {
		return validateNum;
	}

	public void setValidateNum(String validateNum) {
		this.validateNum = validateNum;
	}

	private HashMap<String, Object> dataMap;
	@Autowired
	private AdminServiceImpl adminService;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public HashMap<String, Object> getDataMap() {
		return dataMap;
	}

	public void setDataMap(HashMap<String, Object> dataMap) {
		this.dataMap = dataMap;
	}

	/**
	 * 异步验证用户名密码是否正确 true 用户名密码错误 false 登陆成功
	 * 
	 * @return
	 */
	public String validatePwd() {
		dataMap = new HashMap<>();
		// 验证验证码
		String validateNumTrue = (String) session.get("key");
		if (!validateNum.equalsIgnoreCase(validateNumTrue)) {
			dataMap.put("message", -2);
			return SUCCESS;
		}

		Admin admin = new Admin();
		admin.setUsername(username);
		admin.setPassword(password);
		List<Admin> admin1 = adminService.login(admin);
		boolean flag = false;
		if (admin1 != null) {
			flag = true;
		} else {
			flag = false;
		}
		System.out.println(false);
		if (flag) {
			dataMap.put("message", flag);
		} else {
			dataMap.put("message", flag);
		}
		return SUCCESS;
	}

	/**
	 * -1 验证码错误
	 * 1 验证码正确
	 * @return
	 */
	public String validateNum() {
		dataMap = new HashMap<>();
		// 验证验证码
		String validateNumTrue = (String) session.get("key");
		if (!validateNum.equalsIgnoreCase(validateNumTrue)) {
			dataMap.put("message", -1);
		}else{
			dataMap.put("message", 1);
		}
		
		return SUCCESS;
	}

}
