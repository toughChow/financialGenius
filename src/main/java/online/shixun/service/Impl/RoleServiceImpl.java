package online.shixun.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import online.shixun.dao.Impl.RoleDaoImpl;
import online.shixun.model.Role;
import online.shixun.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {
	@Autowired
	private RoleDaoImpl roleDaoImpl;

	@Override
	public List<Role> getRoles() {
		return roleDaoImpl.getRoles();
	}

	@Override
	public void deleteRole(Role role) {
		roleDaoImpl.deleteRole(role);
	}

	@Override
	public void saveRole(Role role) {
		roleDaoImpl.saveRole(role);
	}

	public void updateRole(Role role) {
		roleDaoImpl.updateRole(role);

	}
	public boolean findRole(Role role){
		List<Role> list=roleDaoImpl.findRole(role);
		if(list.size()>0){
			return true;
		}
		return false;
	}
}
