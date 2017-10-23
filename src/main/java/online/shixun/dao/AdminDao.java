package online.shixun.dao;

import online.shixun.model.Admin;

public interface AdminDao {

	public Admin getAdminByUserAndPassword(Admin admin);
	
	/**
	 * 添加管理员
	 */
	public void addAdmin(Admin admin);
}
