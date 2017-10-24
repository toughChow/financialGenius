package online.shixun.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * 
 * @author toughChow
 * 管理员表
 */
@Entity
@Table(name="tb_admin")
public class Admin {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String username;
	
	private String password;
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "t_admin_res", joinColumns = { @JoinColumn(name = "admin_id") }, inverseJoinColumns = {
			@JoinColumn(name = "res_id") })
	private Set<Resource> Resources = new HashSet<Resource>();

	
	public Admin() {
		super();
	}

	public Admin(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public Admin(Long id, String username, String password, Set<Resource> resources) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		Resources = resources;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<Resource> getResources() {
		return Resources;
	}

	public void setResources(Set<Resource> resources) {
		Resources = resources;
	}
	
}
