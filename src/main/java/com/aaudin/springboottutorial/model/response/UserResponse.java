package com.aaudin.springboottutorial.model.response;

import com.aaudin.springboottutorial.model.User;

public class UserResponse {

	private User data;
	
	public User getData() {
		return data;
	}
	
	public void setData(User data) {
		this.data = data;
	}
}
