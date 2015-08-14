package com.world101.projname.web.front.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.google.common.base.Objects;

@Entity
@Table(name = "user")
public class UserDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1642631808020502616L;

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column
	private String loginName;
	private String userName;
	private String password;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(id, loginName, userName, password);
	}

	@Override
	public boolean equals(final Object obj) {
		if (obj instanceof UserDto) {
			final UserDto other = (UserDto) obj;
			return id == other.id && Objects.equal(loginName, other.loginName)
					&& Objects.equal(userName, other.userName)
					&& Objects.equal(password, other.password);
		} else {
			return false;
		}
	}

}
