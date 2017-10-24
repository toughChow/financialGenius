package online.shixun.action;

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

	public String adminLogin() {
		System.out.println(admin.getUsername()+admin.getPassword());
		boolean flag = adminService.login(admin);
		if (flag==true) {
			session.put("username", admin.getUsername());
			return SUCCESS;
		} else
			return "login";
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

}
