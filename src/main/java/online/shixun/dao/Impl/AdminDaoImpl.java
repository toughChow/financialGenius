package online.shixun.dao.Impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
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
	public Admin getAdminByUserAndPassword(Admin admin) {
		List<Admin> list = (List<Admin>) baseDao.getHibernateTemplate().findByExample(admin);
		if (list != null) {
			return admin;
		} else
			return null;
	}

	@Override
	public void addAdmin(Admin admin) {
		Serializable save = baseDao.getHibernateTemplate().save(admin);
		System.out.println(save);
	}

}
