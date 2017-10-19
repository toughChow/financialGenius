package online.shixun.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import online.shixun.model.User;
import online.shixun.service.Impl.UserServiceImpl;

@Component("userAction")
public class UserAction {
	@Autowired
	private UserServiceImpl userServiceImpl;
	private List<User> list;
	private User user;
	public String findUsers(){
		list=userServiceImpl.findUsers();
		return "list";
	}
	public List<User> getList() {
		return list;
	}
	public void setList(List<User> list) {
		this.list = list;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

}
