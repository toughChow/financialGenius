package online.shixun.service;


import java.util.List;

import online.shixun.model.Admin;

public interface AdminService {
	public List<Admin> login(Admin admin);
	
	/**
	 * 添加管理员
	 * @param admin
	 */
	public void addAdmin(Admin admin);
	public void updateAdmin(Admin admin);
}
