package online.shixun.action;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import online.shixun.model.Role;
import online.shixun.service.Impl.RoleServiceImpl;

@Component("ajaxRoleAction")
public class AjaxRoleAction extends ActionSupport implements ModelDriven<Role>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Role role=new Role();
	private Map<String,Object> dataMap;
	@Autowired
	private RoleServiceImpl roleServiceImpl;
	public String addRoleCheckUsername(){
		boolean flag=roleServiceImpl.findRole(role);
		dataMap=new HashMap<String,Object>();
		if(flag){
			dataMap.put("success",flag);
		}else{
			dataMap.put("success", flag);
		}
		return SUCCESS;
	}
	
	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Map<String, Object> getDataMap() {
		return dataMap;
	}
	public void setDataMap(Map<String, Object> dataMap) {
		this.dataMap = dataMap;
	}
	@Override
	public Role getModel() {
		return role;
	}

}
