package online.shixun.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import online.shixun.model.Admin;
import online.shixun.service.Impl.AdminServiceImpl;

@Component
public class AdminAction extends ActionSupport implements ModelDriven<Admin>,SessionAware {

	private static final long serialVersionUID = 1L;
	
	private Admin admin = new Admin();
	private String newPassword;

	public String getNewPassword() {
		return getNewPassword();
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	private Map<String,Object> dataMap;
	
	public Map<String, Object> getDataMap() {
		return dataMap;
	}

	public void setDataMap(Map<String, Object> dataMap) {
		this.dataMap = dataMap;
	}
	@Autowired
	private AdminServiceImpl adminService;

	private Map<String,Object> session;
	private List<Admin> list;

	public List<Admin> getList() {
		return list;
	}

	public void setList(List<Admin> list) {
		this.list = list;
	}
	public String adminExit(){
		session.clear();
		return "login";
	}
	public String adminLogin() {
		System.out.println(admin.getUsername()+admin.getPassword());
		List<Admin> list1=adminService.login(admin);
		Admin admin3=null;
		if (list1!=null) {
			for (Admin admin : list1) {
				admin3=admin;
			}
			session.put("id", admin3.getId());
			session.put("username", admin3.getUsername());
			return SUCCESS;
		} else
			return "login";
	}
	public String updateAdmin(){
		System.out.println(newPassword);
		admin.setPassword(newPassword);
		System.out.println(session.get("username"));
		admin.setUsername((String)session.get("username"));
		System.out.println(admin.getId());
		adminService.updateAdmin(admin);
		return "update";
	}
	public String jumpToAddAdmin(){
		return "jumpToAddAdmin";
	}

	@Override
	public Admin getModel() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	@Override
	public void setSession(Map<String, Object> arg0) {
		this.session = arg0;
	}
	public String adminCheckPassword(){
		Object obj=session.get("username");
		admin.setUsername((String)obj);
		List<Admin> list1=adminService.login(admin);
		System.out.println(admin.getUsername()+admin.getPassword());
		
		dataMap=new HashMap<String,Object>();
		if(list1!=null){
			dataMap.put("success",true);
		}else{
			dataMap.put("success", false);
		}
		return SUCCESS;
	}

}
