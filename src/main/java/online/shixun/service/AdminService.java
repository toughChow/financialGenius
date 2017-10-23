package online.shixun.service;

import online.shixun.model.Admin;

public interface AdminService {

	public boolean login(Admin admin);
	
	/**
	 * 添加管理员
	 * @param admin
	 */
	public void addAdmin(Admin admin);
}
