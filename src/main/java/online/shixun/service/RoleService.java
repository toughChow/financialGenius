package online.shixun.service;

import java.util.List;

import online.shixun.model.Role;

public interface RoleService {
	public List<Role> getRoles();
	public void deleteRole(Role role);
	public void saveRole(Role role);
	public void updateRole(Role role);

}
