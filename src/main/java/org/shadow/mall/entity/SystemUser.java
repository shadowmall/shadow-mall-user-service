package org.shadow.mall.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="system_user")
@Entity
public class SystemUser {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name = "username", columnDefinition="VARCHAR(50)")
	private String username;
	
	@Column(name = "password", columnDefinition="VARCHAR(200)")
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	
	@Override
	public String toString() {
		return "{用户信息：["
				+ "{用户名："+username+"},"
				+ "{用户密码："+password+"}"
				+ "]}";
	}
}
