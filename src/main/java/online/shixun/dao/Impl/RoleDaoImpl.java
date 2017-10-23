package online.shixun.dao.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import online.shixun.dao.BaseDao;
import online.shixun.dao.RoleDao;
import online.shixun.model.Role;

@Repository
public class RoleDaoImpl implements RoleDao {
	@Autowired
	private BaseDao baseDao;
	private List<Role> list;

	@SuppressWarnings("unchecked")
	@Override
	public List<Role> getRoles() {
		return (List<Role>)baseDao.getHibernateTemplate().find("from Role");
	}

	@Override
	public void deleteRole(Role role) {
		baseDao.getHibernateTemplate().delete(role);
	}

	@Override
	public void saveRole(Role role) {
		baseDao.getHibernateTemplate().save(role);
	}
	public void updateRole(Role role){
		baseDao.getHibernateTemplate().update(role);
		
	}
	public List<Role> getList() {
		return list;
	}

	public void setList(List<Role> list) {
		this.list = list;
	}
}
