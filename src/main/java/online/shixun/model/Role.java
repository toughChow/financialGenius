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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_role")
public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String roleName;
	private String permission;

	public String getPermission() {
		return permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}

	private String description;
	@OneToMany(cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
	@JoinColumn(name = "role_id")
	private Set<User> users = new HashSet<User>();

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Role(Long id, String roleName, String description, String permission) {
		super();
		this.id = id;
		this.roleName = roleName;
		this.description = description;
		this.permission = permission;
	}

	public Role(String roleName, String description, String permission) {
		super();
		this.roleName = roleName;
		this.description = description;
		this.permission = permission;
	}

	public Role(Long id) {
		super();
		this.id = id;
	}

	public Role() {
		super();
	}

	@Override
	public String toString() {
		return "Role [id=" + id + ", roleName=" + roleName + ", description=" + description + ",+permission="
				+ permission + "]";
	}

}
