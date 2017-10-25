package online.shixun.service.Impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import online.shixun.dao.Impl.AdminDaoImpl;
import online.shixun.model.Admin;
import online.shixun.service.AdminService;

@Service("adminService")
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminDaoImpl adminDao;

	/**
	 * 错误false 用户名密码验证正确true
	 */
	public List<Admin> login(Admin admin) {
		List<Admin> admin2 = adminDao.getAdminByUserAndPassword(admin);
		return admin2;
		
	}

	@Override
	public void addAdmin(Admin admin) {
		adminDao.addAdmin(admin);
	}
	public void updateAdmin(Admin admin){
		adminDao.updateAdmin(admin);
	}
}
