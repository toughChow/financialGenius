package online.shixun.action;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;

import online.shixun.service.Impl.UserServiceImpl;

@Component
public class AjaxUserAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private String username;

	private HashMap<String, Object> dataMap;

	@Autowired
	private UserServiceImpl userService;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public HashMap<String, Object> getDataMap() {
		return dataMap;
	}

	public void setDataMap(HashMap<String, Object> dataMap) {
		this.dataMap = dataMap;
	}

	/**
	 * 验证用户名是否已经存在
	 * @return
	 */
	public String validateUsername() {
		dataMap = new HashMap<>();
		boolean flag = userService.getUserByName(username);
		if(flag){
			dataMap.put("message", true);
		}else{
			dataMap.put("message", false);
		}
		return SUCCESS;
	}
}
