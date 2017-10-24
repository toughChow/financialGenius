package online.shixun.dao;


import java.util.List;

import online.shixun.model.Admin;

public interface AdminDao {

	public List<Admin> getAdminByUserAndPassword(Admin admin);
	
	/**
	 * 添加管理员
	 */
	public void addAdmin(Admin admin);
}
