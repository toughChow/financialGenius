package online.shixun.action;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;

import online.shixun.model.Admin;
import online.shixun.service.Impl.AdminServiceImpl;

@Component
public class AjaxAdminAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private String username;
	private String password;
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
	 * 异步验证用户名密码是否正确
	 * 
	 * @return
	 */
	public String validatePwd() {
		Admin admin = new Admin();
		admin.setUsername(username);
		admin.setPassword(password);

		dataMap = new HashMap<>();
		boolean flag = adminService.login(admin);
		if (flag == true) {
			dataMap.put("message", flag);
		} else {
			dataMap.put("message", flag);
		}
		return SUCCESS;
	}

}
