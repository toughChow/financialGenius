package online.shixun.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import online.shixun.dao.AdminDao;
import online.shixun.model.Admin;
import online.shixun.service.AdminService;

@Service("adminService")
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminDao adminDao;

	/**
	 * 不存在返回false 存在返回true
	 */
	public boolean login(Admin admin) {
		Admin admin2 = adminDao.getAdminByUserAndPassword(admin);
		if (admin2 == null)
			return false;
		else
			return true;
	}

	@Override
	public void addAdmin(Admin admin) {
		adminDao.addAdmin(admin);
	}

}
