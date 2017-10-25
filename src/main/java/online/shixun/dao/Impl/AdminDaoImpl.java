package online.shixun.dao.Impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import online.shixun.dao.AdminDao;
import online.shixun.dao.BaseDao;
import online.shixun.model.Admin;

@Repository("adminDao")
public class AdminDaoImpl implements AdminDao {

	@Autowired
	private BaseDao baseDao;
	@Override
	public List<Admin> getAdminByUserAndPassword(Admin admin) {
		List<Admin> list = (List<Admin>) baseDao.getHibernateTemplate().findByExample(admin);
		if (list.size()>0) {
			return list;
		} else
			return null;
	}

	@Override
	public void addAdmin(Admin admin) {
		Serializable save = baseDao.getHibernateTemplate().save(admin);
		System.out.println(save);
	}
	@SuppressWarnings("unchecked")
	public List<Admin> getAdminByUser(Admin admin){
		String param[]={"username"};
		String value[]={admin.getUsername()};
		return (List<Admin>)baseDao.getHibernateTemplate().findByNamedParam("from Admin where username=:username", param, value);
	}
	public void updateAdmin(Admin admin){
		baseDao.getHibernateTemplate().update(admin);
	}

}
