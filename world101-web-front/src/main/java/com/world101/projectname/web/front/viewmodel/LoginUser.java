package com.world101.projectname.web.front.viewmodel;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class LoginUser {
	@NotNull
	@Size(min=3, max=20)
	private String username;
	@NotNull
	@Size(min=3, max=20)
	private String password;

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
}
