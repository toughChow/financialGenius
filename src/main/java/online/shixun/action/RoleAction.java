package online.shixun.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import online.shixun.model.Role;
import online.shixun.service.Impl.RoleServiceImpl;

@Component("roleAction")
public class RoleAction extends ActionSupport implements ModelDriven<Role>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Autowired
	private RoleServiceImpl roleServiceImpl;
	private List<Role> list;
	private Role role=new Role();
	public String getRoles(){
		list=roleServiceImpl.getRoles();
		return "list";
	}
	public String saveRole(){
		roleServiceImpl.saveRole(role);
		list=roleServiceImpl.getRoles();
		return "save";
	}
	public String toUpdate(){
		return "toUpdate";
	}
	public String deleteRole(){
		roleServiceImpl.deleteRole(role);
		list=roleServiceImpl.getRoles();
		return "delete";
	}
	public String updateRole(){
		roleServiceImpl.updateRole(role);
		list=roleServiceImpl.getRoles();
		return "update";
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public List<Role> getList() {
		return list;
	}
	public void setList(List<Role> list) {
		this.list = list;
	}
	@Override
	public Role getModel() {
		return role;
	}

}
